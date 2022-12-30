import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Cactus extends Actor
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        // Add your action code here.
        RemoveHealth();
    }

    public Cactus()
    {
        imageScale();
    }
    
    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(50,80);    
    }

    protected void  RemoveHealth()
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
