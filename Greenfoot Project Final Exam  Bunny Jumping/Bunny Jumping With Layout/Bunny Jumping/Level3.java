import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public Level3()
    {
        Prepare(1);
        Prepare();
    }

    private void Prepare(int n)
    {
        for (int x=0; x<n; x++)
        {
            addObject(new Cactus(), X_CACTUS_POS +  X_CACTUS_GAP*x, 384);
            addObject(new LongCactus2(), X_CACTUS_POS*2 +  X_CACTUS_GAP*x, 374);
            addObject(new LongCactus3(), X_CACTUS_POS*3 +  X_CACTUS_GAP*x, 360);
            addObject(new Cactus3(), X_CACTUS_POS*4 +  X_CACTUS_GAP*x, 384);
            addObject(new LongCactus4(), X_CACTUS_POS*5 +  X_CACTUS_GAP*x, 360);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Prepare()
    {
        for (int x=0; x<2; x++)
        {
            addObject(new Animal(),1100,265);
            addObject(new Animal(),500,265);

        }
        Carrot carrot = new Carrot();
        addObject(carrot,229,296);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,302,386);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,441,236);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,493,330);
        Carrot carrot5 = new Carrot();
        addObject(carrot5,498,388);
        carrot5.setLocation(498,390);
        Carrot carrot6 = new Carrot();
        addObject(carrot6,681,388);
        Carrot carrot7 = new Carrot();
        addObject(carrot7,769,303);
        Carrot carrot8 = new Carrot();
        addObject(carrot8,876,385);
        Carrot carrot9 = new Carrot();
        addObject(carrot9,1017,225);
        Carrot carrot10 = new Carrot();
        addObject(carrot10,1070,385);
        carrot9.setLocation(1020,249);
        // flag
        addObject(new Flag3(),1170,392);
    }
}
