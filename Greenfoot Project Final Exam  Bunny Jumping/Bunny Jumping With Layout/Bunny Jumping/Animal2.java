import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal2 extends Animal
{
    /**
     * Act - do whatever the Animal2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = -2;
    private int count = 0;
    public void act()
    {
        // Add your action code here.
        count++;
        moveAround();
    }

    private void moveAround()
    {
        if(count < 80)
            setLocation(getX() + speed, getY());
        else{
            speed=-speed;
            getImage().mirrorHorizontally();
            count=0;
        }
    }

    public Animal2()
    {
                   
    } 

    protected void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(150,60); 
    }
}
