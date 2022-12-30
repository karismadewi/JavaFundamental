import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Robot robot = new Robot();
        addObject(robot,48,50);

        block block = new block();
        addObject(block,427,145);

        wall wall = new wall();
        addObject(wall,48,50);
        wall.setLocation(48,147);

        wall wall2 = new wall();
        addObject(wall2,52,147);

        wall wall3 = new wall();
        addObject(wall3,159,147);

        wall wall4 = new wall();
        addObject(wall4,266,147);

        wall wall5 = new wall();
        addObject(wall5,587,147);

        wall wall6 = new wall();
        addObject(wall6,692,147);

        wall wall7 = new wall();
        addObject(wall7,791,147);

        home home = new home();
        addObject(home,751,552);


        pizza pizza = new pizza();
        addObject(pizza,720,46);

        pizza pizza2 = new pizza();
        addObject(pizza2,443,38);

        pizza pizza3 = new pizza();
        addObject(pizza3,183,302);

        pizza pizza4 = new pizza();
        addObject(pizza4,682,312);

        pizza pizza5 = new pizza();
        addObject(pizza5,417,537);

        ScorePanel scorePanel = new ScorePanel();
        addObject(scorePanel,89,541);
    }
}
