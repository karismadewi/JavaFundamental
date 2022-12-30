import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bunny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bunny extends Actor
{
    /**
     * Act - do whatever the Bunny wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    private int vspeed = 0;
    private int JumpStreght = -10;
    private int score;
    private int getCarrot;
    private int timer;
    public  int lives = 3;
    GreenfootSound eating = new GreenfootSound("Eating.mp3");
    public void act()
    {
        // Add your action code here.
        MoveHero();
        checkFalling();
        LandOnTop();
        TouchCarrot();
        // TouchAnimal();
        UpLevels();
    }

    public Bunny()
    {
        ImageScale();
    }   

    private void ImageScale ()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }   

    private void MoveHero()
    { 
        if (Greenfoot.isKeyDown("A"))
        {
            setImage("bunny-left.png");
            ImageScale();
            MoveLeft();
        }

        if (Greenfoot.isKeyDown("D"))
        {
            setImage("bunny-right.png");
            ImageScale();
            MoveRight();
        }

        if (Greenfoot.isKeyDown("space"))
        {
            setImage("bunny-jump.png");
            ImageScale();
            if(onGround() == true || getY() > 600)
            {
                Jump();
            }

        }
    }

    private void MoveLeft()
    {
        setLocation(getX()-speed, getY());   
    }

    private void MoveRight()
    {
        setLocation(getX()+speed, getY());
    }

    private void Falling()
    {
        setLocation(getX(), getY() + vspeed);
        vspeed = vspeed + 1;
    }

    private boolean onGround()
    {
        Actor groundBelow;
        groundBelow = getOneObjectAtOffset(0, 30, Ground.class);
        if(groundBelow != null || getY() > 600)
        {
            return true;
        }
        else
        {
            return false; 
        }
    }

    private void LandOnTop()
    {
        if(isTouching(Ground.class))
        {
            setLocation(getX(), getY());
        }
    }

    private void checkFalling()
    {
        if(onGround()==true)
        {
            vspeed = 0;
        }
        else
        {
            Falling();
        } 
    }

    private void Jump()
    {
        vspeed = - 20;
        Falling();
    }

    private void TouchCarrot()
    {
        if(isTouching(Carrot.class))
        {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            eating.play();
            counter.setValue(1);
            removeTouching(Carrot.class);
        }
    }

    public void UpLevels()
    {
        if (isTouching(Flag.class))
        {
            Greenfoot.setWorld(new Level2());
        }    
        if (isTouching(Flag2.class))
        {
            Greenfoot.setWorld(new Level3());
        } 
        if (isTouching(Flag3.class))
        {
            Greenfoot.setWorld(new Level4());
        }  
        if (isTouching(Flag4.class))
        {
            Greenfoot.setWorld(new Level5());
        }  
        if (isTouching(Flag5.class))
        {
            Greenfoot.setWorld(new Finish());
        } 
    }

    // private void TouchAnimal()
    // {
        // if(isTouching(Animal.class))
        // {
            // lives--;

            // getWorld().addObject(new Electro(),getX(),getY());

            // getWorld().removeObjects(getWorld().getObjects(Heart.class));

            // for (int x = 0; x<lives; x++)
            // {
                // Heart heart = new Heart();
                // getWorld().addObject(new Heart(), 46+40*x,35);  
                // setLocation(73,395); 
            // }

            // if (lives == 0)
            // {
                
                // getWorld().removeObject(this);
                // Greenfoot.setWorld(new EndWorld());
            // }
        // }
    // }

}
