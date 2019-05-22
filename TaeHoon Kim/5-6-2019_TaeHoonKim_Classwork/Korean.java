import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Korean extends Animal
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("right"))
        {
        turn(10);
        }
        if(Greenfoot.isKeyDown("left"))
        {
        turn(-10);
        }
        move(2);
    }    
}
