import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    
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
        move(2);
    }    
}
