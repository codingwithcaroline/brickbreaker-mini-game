import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle extends Actor
{
    public Paddle() 
    {
        GreenfootImage img = getImage();
        img.scale(100,25);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }    
}
