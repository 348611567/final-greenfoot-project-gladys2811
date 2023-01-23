import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My World.
 * 
 * @author Gladys Lee
 * @version January 2023
 */
public class MyWorld extends World
{
    Label scoreLabel;
    int score = 1;
    SimpleTimer starTimer = new SimpleTimer();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        createNinjaStar();
    }
    
    public void createNinjaStar()
    {
        starTimer.mark();
        if(starTimer.millisElapsed() > 500)
        {
            NinjaStar star = new NinjaStar();
            addObject(star, 575, 369);
            starTimer.mark();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ninja ninja = new Ninja();
        addObject(ninja,58,371);
        NinjaStar star = new NinjaStar();
        addObject(star, 575, 369);
    }
}
