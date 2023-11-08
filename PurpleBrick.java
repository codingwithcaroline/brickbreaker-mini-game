import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PurpleBrick extends Brick
{
    private int life = 300;
    
    public void act() 
    {
        if (isTouching(Ball.class))
        {
            life = life - 100;
        }     
    }   
    
    public int getlife() {
        return life;
    }
}

