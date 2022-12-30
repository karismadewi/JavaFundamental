import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        resetEdge();
        RemoveLive();
        move(-5);
    }

    public Animal()
    {
        imageScale();
    } 

    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }

    protected void resetEdge()
    {
        if(isAtEdge())
        {
            setLocation(1200,getY());
        } 
    }
    
    protected void  RemoveLive()
    {    
        Bunny b = (Bunny) getOneIntersectingObject(Bunny.class);
        
        if (b != null)
        {
            b.lives--;
            
            // Levels.scoreCount.add(-100);
            
            getWorld().addObject(new Electro(),getX(),getY());
            
            getWorld().removeObjects(getWorld().getObjects(Heart.class));
            
            for (int x = 0; x<b.lives; x++)
            {
                Heart heart = new Heart();
                getWorld().addObject(new Heart(), 46+40*x,35);  
                b.setLocation(73,395); 
            }

            if (b.lives == 0)
            {
                getWorld().removeObject(b);
                Greenfoot.setWorld(new EndWorld());
            }

        }

    }

}
