import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class block extends Actor
{
    /**
     * Act - do whatever the block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int clockwise = getRotation() + 2;
        if(clockwise == 360){
            clockwise = 0;
        }
        setRotation(clockwise);
        
    }
}
