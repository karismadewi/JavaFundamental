import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2; 
    private int liveCo = 3; 
    private int pizzaEaten = 0;
    
    public Robot()
    {
        robotimage1=new GreenfootImage("man01.png");
        robotimage2=new GreenfootImage("man02.png");
        //setImage(robotimage1);
        //int pizzaEaten = 0;      
    }
    private int speed=1;
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
    public void robotMovement(){
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-speed);
            animate();
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+speed);
            animate();
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-speed, getY());
            animate();
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed, getY());
            animate();
        }
    }
    public void detectWallCollision(){
        if(isTouching(wall.class))
        {
            setLocation(48,50);
        }
        
    }
    public void detectBlockCollision(){
        if(isTouching(block.class))
        {
            setLocation(48,50);
        }
        
    }
    public void animate(){
        if(getImage()==robotimage1)
        setImage(robotimage2);
        else
        setImage(robotimage1);
    }
    public void lifeCounter(){
        liveCo=liveCo--;
        //testEndGame();
        //showStatus();
    }
    public void pizzaEaten(){
        if(isTouching(pizza.class)){
            removeTouching(pizza.class);
            pizzaEaten++;
        }
    }

}
