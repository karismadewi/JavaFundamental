import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        Prepare(1);
        Prepare();
    }
    
    private void Prepare(int n)
    {
        for (int x=0; x<n; x++)
        {
            addObject(new LongCactus1(), X_CACTUS_POS +  X_CACTUS_GAP*x, 360);
            addObject(new LongCactus2(), X_CACTUS_POS*2 +  X_CACTUS_GAP*x, 374);
            addObject(new LongCactus3(), X_CACTUS_POS*3 +  X_CACTUS_GAP*x, 360);
            addObject(new LongCactus4(), X_CACTUS_POS*4 +  X_CACTUS_GAP*x, 360);
            addObject(new LongCactus4(), X_CACTUS_POS*5 +  X_CACTUS_GAP*x, 360);

        }
    }
    
    private void Prepare()
    {
        Carrot carrot = new Carrot();
        addObject(carrot,285,247);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,478,389);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,481,314);
        carrot3.setLocation(475,314);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,681,348);
        Carrot carrot5 = new Carrot();
        addObject(carrot5,701,281);
        Carrot carrot6 = new Carrot();
        addObject(carrot6,781,225);
        carrot6.setLocation(773,222);
        Carrot carrot7 = new Carrot();
        addObject(carrot7,890,364);
        Carrot carrot8 = new Carrot();
        addObject(carrot8,1055,401);
        Carrot carrot9 = new Carrot();
        addObject(carrot9,281,395);
        Carrot carrot10 = new Carrot();
        addObject(carrot10,987,226);
        carrot10.setLocation(973,227);
        //flag
        addObject(new Flag2(),1170,392);
    }
}
