import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends Levels
{

    /**
     * Constructor for objects of class level4.
     * 
     */
    public Level4()
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
            addObject(new Cactus3(), X_CACTUS_POS*4 +  X_CACTUS_GAP*x, 384);
            
        }
    }
    
    private void Prepare()
    {
        for (int x=0; x<2; x++)
        {
            addObject(new Animal(),1000,265);
            addObject(new Animal(),100,265);

        }
        Carrot carrot = new Carrot();
        addObject(carrot,241,241);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,283,303);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,286,371);
        carrot3.setLocation(283,376);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,476,377);
        Carrot carrot5 = new Carrot();
        addObject(carrot5,518,295);
        Carrot carrot6 = new Carrot();
        addObject(carrot6,619,228);
        Carrot carrot7 = new Carrot();
        addObject(carrot7,676,376);
        Carrot carrot8 = new Carrot();
        addObject(carrot8,776,298);
        Carrot carrot9 = new Carrot();
        addObject(carrot9,873,382);
        Carrot carrot10 = new Carrot();
        addObject(carrot10,1085,306);
        Animal2 animal22 = new Animal2();
        addObject(animal22,1102,388);
        animal22.setLocation(1090,403);
        animal22.setLocation(1086,400);
        // flag
        addObject(new Flag4(),1170,392);
    }
}
