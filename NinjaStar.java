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
    GreenfootImage[] idle = new GreenfootImage[2];
    public NinjaStar()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/star_idle/idle" + i + ".png");
        }
        setImage(idle[1]);
    }
    
    int imageIndex = 0;
    public void animateNinjaStar()
    {
        setImage(idle[imageIndex]);
        imageIndex = imageIndex + 1 % idle.length;
    }
    /**
     * Act - do whatever the NinjaStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        
        animateNinjaStar();
    }   
    
}
