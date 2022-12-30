import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//inheritance
public class Cactus2 extends Cactus
{
    /**
     * Act - do whatever the cactus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        RemoveHealth();
    }
    
    public Cactus2()
    {
        
    }
    
    //overriding
    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(50,120); 
    }
}
