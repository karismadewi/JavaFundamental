import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends Levels
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {
        Prepare(1);
        Prepare();
    }

    private void Prepare(int n)
    {
        for (int x=0; x<n; x++)
        {
            addObject(new LongCactus2(), X_CACTUS_POS +  X_CACTUS_GAP*x, 374);
            addObject(new LongCactus3(), X_CACTUS_POS*2 +  X_CACTUS_GAP*x, 360);
            addObject(new LongCactus4(), X_CACTUS_POS*3 +  X_CACTUS_GAP*x, 360);
            addObject(new Cactus3(), X_CACTUS_POS*5 +  X_CACTUS_GAP*x+40, 384);

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
            addObject(new Animal(),1000,265);
            addObject(new Animal(),500,265);

        }

        Animal2 animal22 = new Animal2();
        addObject(animal22,945,390);
        animal22.setLocation(910,400);
        Carrot carrot = new Carrot();
        addObject(carrot,193,236);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,289,299);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,297,370);
        carrot3.setLocation(290,373);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,433,253);
        Carrot carrot5 = new Carrot();
        addObject(carrot5,482,318);
        Carrot carrot6 = new Carrot();
        addObject(carrot6,530,387);
        carrot6.setLocation(533,386);
        carrot5.setLocation(470,319);
        Carrot carrot7 = new Carrot();
        addObject(carrot7,657,279);
        Carrot carrot8 = new Carrot();
        addObject(carrot8,667,392);
        Carrot carrot9 = new Carrot();
        addObject(carrot9,930,311);
        Carrot carrot10 = new Carrot();
        addObject(carrot10,1081,396);
        // flag
        addObject(new Flag5(),1170,392);
    }
}
