import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class actor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class actor extends Actor
{
    /**
     * Act - do whatever the actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(12);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(-12);
        }
        move(5);
    }    
}
