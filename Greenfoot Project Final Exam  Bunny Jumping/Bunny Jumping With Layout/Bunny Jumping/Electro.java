import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Electro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Electro extends Actor
{
    /**
     * Act - do whatever the Electro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        ElectroHit();
    }

    public  Electro()
    {
        imageScale();  
    }

    private void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(100,90);  
    }

    private int time=20;

    private void ElectroHit()
    {
        time--;
        if(time==0){
            getWorld().removeObject(this);
        }
    }
}
