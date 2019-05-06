import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ant extends Player
{
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
