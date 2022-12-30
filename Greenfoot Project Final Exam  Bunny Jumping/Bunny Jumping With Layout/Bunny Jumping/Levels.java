import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{

    /**
     * Constructor for objects of class Levels.
     * 
     */
    public int X_CLOUD_POS = 90;
    public int X_CLOUD_GAP = 300;
    public int X_CACTUS_POS = 195;
    public int X_CACTUS_GAP = 300;
    public   static Counter scoreCount = new Counter();
    public static int inLevel = 1;
    
    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
        Layouts();
        prepare();
        
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public void Layouts()
    {
        //cloud1
        for (int x=0; x<4; x++)
        {
            addObject(new Cloud(), X_CLOUD_POS*2 +  X_CLOUD_GAP*x, 100);
        }

        //cloud2
        for (int x=0; x<4; x++)
        {
            addObject(new Cloud2(), X_CLOUD_POS +  X_CLOUD_GAP*x, 50);
        }

        //heart
        for (int x = 0; x<3; x++)
        {
            Heart heart = new Heart();
            addObject(heart, 46+40*x,35);  
        }

        //bunny
        addObject(new Bunny(),73,395);

        //ground
        addObject(new Ground(),600,465);

        // // flag
        // addObject(new Flag(),1170,392);

        //scorecount 
        addObject(scoreCount,1120,35);
        scoreCount.setValue(0);

    }

    public void setUpLevels()
    {
        if(inLevel == 2)
        {
            Greenfoot.setWorld(new Level2());
        }else if(inLevel == 3)
        {
            Greenfoot.setWorld(new Level3());
        }
        else if(inLevel == 4)
        {
            Greenfoot.setWorld(new Level4());
        }
        else if(inLevel == 5)
        {
            Greenfoot.setWorld(new Level5());

        }
    }

    public void upLevel()
    {
        inLevel++;
        setUpLevels();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
