import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeScreen extends World
{

    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
        prepare();
        // backgroundSummer.play();
    }

    public void act ()
    {
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Level1());
        }
        // backgroundSummer.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
