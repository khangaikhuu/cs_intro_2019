import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Animal
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")) {
        turn(5);
        }
        if(Greenfoot.isKeyDown("right")) {
        turn(-5);
        }
        move(4);
    }    
}
