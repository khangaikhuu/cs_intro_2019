import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class crab extends Actor
{
    public void act() 
    {
       if(Greenfoot.isKeyDown("left")) {
       
           turn(2);
       }
       if(Greenfoot.isKeyDown("right")) {
       
           turn(-2);
       }
       move(1);
    }
}
