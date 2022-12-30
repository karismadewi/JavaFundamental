import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    /**
     * Constructor for objects of class Levels1.
     * 
     */
    public Level1()
    {
        Prepare(1);
        Prepare();
        backgroundSummer.play();
    }

    //overloading
    private void Prepare(int n)
    {
        for (int x=0; x<n; x++)
        {
            addObject(new Cactus(), X_CACTUS_POS +  X_CACTUS_GAP*x, 384);
            addObject(new Cactus2(), X_CACTUS_POS*2 +  X_CACTUS_GAP*x, 365);
            addObject(new Cactus3(), X_CACTUS_POS*3 +  X_CACTUS_GAP*x, 384);
            addObject(new Cactus4(), X_CACTUS_POS*4 +  X_CACTUS_GAP*x, 384);
            addObject(new Cactus4(), X_CACTUS_POS*5 +  X_CACTUS_GAP*x, 384);

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Prepare()
    {
        Carrot carrot = new Carrot();
        addObject(carrot,283,380);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,486,353);
        carrot2.setLocation(484,378);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,688,369);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,879,372);
        Carrot carrot5 = new Carrot();
        addObject(carrot5,1065,385);
        //flag
        addObject(new Flag(),1170,392);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
}
