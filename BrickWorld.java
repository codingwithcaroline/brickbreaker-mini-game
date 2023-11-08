import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BrickWorld extends World
{

    public BrickWorld()
    {    
        // Set up the world and paint order.
        super(569, 400, 1, true);
        setPaintOrder(Brick.class, Ball.class, Paddle.class);
        
        // Add the Ball to the World.
        addObject(new Ball(), 285, 315);
        
        // Add the Paddle to the World.
        addObject(new Paddle(), 285, 385);
        
        // Add the top row of Bricks to the World.
        addObject(new Brick(), 540, 12);
        addObject(new Brick(), 483, 12);
        addObject(new Brick(), 426, 12);
        addObject(new Brick(), 369, 12);
        addObject(new Brick(), 312, 12);
        addObject(new Brick(), 255, 12);
        addObject(new Brick(), 198, 12);
        addObject(new Brick(), 141, 12);
        addObject(new Brick(), 84, 12);
        addObject(new Brick(), 27, 12);
        
        //Add second row of Bricks to the World
        addObject(new Brick(), 540, 39);
        addObject(new Brick(), 483, 39);
        addObject(new Brick(), 426, 39);
        addObject(new Brick(), 369, 39);
        addObject(new Brick(), 312, 39);
        addObject(new Brick(), 255, 39);
        addObject(new Brick(), 198, 39);
        addObject(new Brick(), 141, 39);
        addObject(new Brick(), 84, 39);
        addObject(new Brick(), 27, 39);
        
        //Add third row of Bricks to the World
        addObject(new Brick(), 540, 66);
        addObject(new Brick(), 483, 66);
        addObject(new Brick(), 426, 66);
        addObject(new Brick(), 369, 66);
        addObject(new Brick(), 312, 66);
        addObject(new Brick(), 255, 66);
        addObject(new Brick(), 198, 66);
        addObject(new Brick(), 141, 66);
        addObject(new Brick(), 84, 66);
        addObject(new Brick(), 27, 66);
        
        //Add a fourth row of Bricks to the World
        addObject(new Brick(), 540, 93);
        addObject(new Brick(), 483, 93);
        addObject(new Brick(), 426, 93);
        addObject(new Brick(), 369, 93);
        addObject(new Brick(), 312, 93);
        addObject(new Brick(), 255, 93);
        addObject(new Brick(), 198, 93);
        addObject(new Brick(), 141, 93);
        addObject(new Brick(), 84, 93);
        addObject(new Brick(), 27, 93);
        
        //Add a fifth row of Bricks to the World
        addObject(new Brick(), 540, 120);
        addObject(new Brick(), 483, 120);
        addObject(new Brick(), 426, 120);
        addObject(new Brick(), 369, 120);
        addObject(new Brick(), 312, 120);
        addObject(new Brick(), 255, 120);
        addObject(new Brick(), 198, 120);
        addObject(new Brick(), 141, 120);
        addObject(new Brick(), 84, 120);
        addObject(new Brick(), 27, 120);
        
        //Add a sixth row of Bricks to the World
        addObject(new Brick(), 540, 147);
        addObject(new Brick(), 483, 147);
        addObject(new Brick(), 426, 147);
        addObject(new Brick(), 369, 147);
        addObject(new Brick(), 312, 147);
        addObject(new Brick(), 255, 147);
        addObject(new Brick(), 198, 147);
        addObject(new Brick(), 141, 147);
        addObject(new Brick(), 84, 147);
        addObject(new Brick(), 27, 147);

    }
    
}
