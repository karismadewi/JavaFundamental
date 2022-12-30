import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LongCactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongCactus2 extends LongCactus1
{
    /**
     * Act - do whatever the LongCactus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        RemoveHealth();
    }

    public LongCactus2()
    {
        
    }

    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(50,100); 
    }
}
