import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BlueBrick extends Brick
{
    private int life = 200;

    public void act() 
    {
        if (isTouching(Ball.class))
        {
            life = life - 100;
        }     
    }
    
    public int getlife()
    {
        return life;
    }
    
}
