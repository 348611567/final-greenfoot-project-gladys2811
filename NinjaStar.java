import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ninja Star.
 * 
 * @author Gladys 
 * @version January 2023
 */
public class NinjaStar extends Actor
{
    MyWorld world;
    
    /**
     * Act - do whatever the NinjaStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int imageIndex = 0;
    public void act() 
    {
        // Ninja star heads towards the Ninja
        move(-8);
        
        //Game over if Ninja touches the ninja star
        if (this.isAtEdge())
        {
            getWorld().removeObject(this);
            world.addObject(this,575,369);
            world.addScore();
        }
        else if (this.isTouching(Ninja.class))
        {
            world.removeObject(this);
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
    }   
    
}
