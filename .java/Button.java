import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(null))
        {
            getWorld().removeObject(this);
            BrickWorld game = new BrickWorld();
            Greenfoot.setWorld(game);
        }
    }    
}
