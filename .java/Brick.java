import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Brick extends Actor
{
    private int life = 100;
    
    public Brick()
    {
        GreenfootImage img = getImage();
        img.scale(55,25);
    }
    
    public void act() 
    {
        if (isTouching(Ball.class))
        {
            life = life - 34;
        }        
    }
    
    public int getlife()
    {
        return life;
    }
}
