import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-1);
        resetEdge();
    }

    public Cloud()
    {
        imageScale();
    }

    private void imageScale()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    protected void resetEdge(){
        if(isAtEdge())
        {
            setLocation(1200,getY());
        } 
    }

    // public int speed = 5;

    // public Cloud(int speedinput)
    // {
        // //setRotation(-180);
        // this.speed=speedinput;
        // move(speed);
    // }

}
