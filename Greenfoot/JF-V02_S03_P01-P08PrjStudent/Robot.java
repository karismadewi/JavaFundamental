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
    private GreenfootImage gameover;
    private int lifeCo = 3; 
    private int pizzaEaten = 0;
    private int score = 0;    
    
    public Robot()
    {
        robotimage1=new GreenfootImage("man01.png");
        robotimage2=new GreenfootImage("man02.png");
        gameover=new GreenfootImage("gameover.png");
        //setImage(robotimage1);
        //int pizzaEaten = 0;      
    }
    private int speed=4;
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
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
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
        
    }
    public void detectBlockCollision(){
        if(isTouching(block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
        
    }
    public void detectHome(){
        if(isTouching(home.class)&& pizzaEaten==5)
        {
            increaseScore();
            Greenfoot.playSound("yipee.wav");
            setLocation(48,50);
            pizzaEaten=0;
            
        }
    }
    
    public void animate(){
        if(getImage()==robotimage1)
        setImage(robotimage2);
        else
        setImage(robotimage1);
    }
    public void removeLife(){
        lifeCo--;
        testEndGame();
        showStatus();
    }
    public void eatPizza(){
        if(isTouching(pizza.class)){
            removeTouching(pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    public void testEndGame(){
        if(lifeCo==0){
            setImage(gameover);
            Greenfoot.stop();
            }
    }
    public void increaseScore(){
        if(pizzaEaten==5){
            score++;
        }
        showStatus();
    }
    public void showStatus(){
        getWorld().showText("Lives : "+lifeCo,89,510);
        getWorld().showText("Pizza : "+pizzaEaten,89,540);
        getWorld().showText("Score : "+score,89,565);
    }




}
