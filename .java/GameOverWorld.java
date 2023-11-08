import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverWorld extends World
{
    public GameOverWorld()
    {    
        super(580, 400, 1); 
        addObject(new gameOver(), 290, 200);
    }
}
