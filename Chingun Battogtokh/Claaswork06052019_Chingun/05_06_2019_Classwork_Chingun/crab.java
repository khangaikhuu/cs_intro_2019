import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class crab extends Actor
{
   
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")){ 
        turn(10); 
    } 
    if(Greenfoot.isKeyDown("right")){ 
        turn(-10); 
    } 
    move(3); // Add your action code here.
    }    
}
