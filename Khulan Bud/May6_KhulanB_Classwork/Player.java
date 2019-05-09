import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        turn(4);
        move(3);
       if(Greenfoot.isKeyDown("left"));
       {
       //
           move(3);
    }
      if(Greenfoot.isKeyDown("right"));
      {
         // turn(-4);
              move(-3);
        }
    }    
}
