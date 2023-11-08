import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    private int bricksBroken = 0;
    
    public Ball()
    {
        GreenfootImage img = getImage();
        img.scale (35,35);
        setRotation(-90);
    }
    
    public void turn()
    {
        if (isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(90));
        }   
    }

    public boolean hitTopWall()
    {
        if (getY() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean hitBottomWall()
    {
        if (getY() == getWorld().getHeight()-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean hitLeftWall()
    {
        if (getX() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean hitRightWall()
    {
        if(getX() == getWorld().getWidth()-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void handleWallCollision()
    {
        if (hitRightWall())
        {
            turn(75);
        }
        else if(hitLeftWall())
        {   
            turn(60);
        }
        else if(hitBottomWall())
        {
           Greenfoot.stop();
           GameOverWorld gameOver = new GameOverWorld();
           Greenfoot.setWorld(gameOver);
        }
        else if(hitTopWall())
        {
            turn(90);
        }

    }
    
    public void act() 
    {
        turn();
        move(5);
        
        if (isTouching(Brick.class))
        {
            
            Brick Brick1 = (Brick) getOneIntersectingObject(Brick.class);
            if (Brick1.getlife() <= 0)
            {
                bricksBroken++;
                getWorld().removeObject(Brick1);
                
            }
            
            turn(100);
        }
        
        if (isTouching(Paddle.class))
        {
            turn(Greenfoot.getRandomNumber(90));
        }
        
        if (bricksBroken >= 60)
        {
            Greenfoot.stop();
        }
        
        handleWallCollision();
    }   
    
    
    
}
