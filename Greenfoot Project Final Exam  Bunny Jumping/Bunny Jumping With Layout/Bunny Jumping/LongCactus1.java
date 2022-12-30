import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LongCactus1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongCactus1 extends Cactus
{
    /**
     * Act - do whatever the LongCactus1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        RemoveHealth();
    }

    public LongCactus1()
    {
        imageScale();
    }

    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(50,130); 
    }
}
