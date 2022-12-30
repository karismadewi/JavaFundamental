import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndWorld extends World
{

    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Level1());
        }

        if(Greenfoot.isKeyDown("backspace"))
        {
            Greenfoot.setWorld(new HomeScreen());
        }

            
    }
}
