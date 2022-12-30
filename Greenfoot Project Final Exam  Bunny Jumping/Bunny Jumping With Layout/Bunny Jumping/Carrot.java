import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrot extends Actor
{
    /**
     * Act - do whatever the Carrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }

    public Carrot()
    {
        imageScale();
    }

    private void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(50,25);  
    }

    // public void addScore()
    // {
        // // Bunny b = (Bunny) getOneIntersectingObject(Bunny.class);
        // if(isTouching(Bunny.class))
        // {
            // Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            // counter.setValue(100);
            // this.removeTouching(Carrot);
        // }

    // }
}
