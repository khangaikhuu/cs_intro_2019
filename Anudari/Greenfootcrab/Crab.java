import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Animal
{
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("Left")) {
            turn(12);
        }
         if(Greenfoot.isKeyDown("right")) {
            turn(12);
        }
        
        move(1);
        
    }    
}

