import greenfoot.*;  

public class Crab extends Animal
{
    public void act() 
    {
      if(Greenfoot.isKeyDown( "left")) {
        turn (12);
      }
      if(Greenfoot.isKeyDown( "right")) {
        turn(-12);
      }
      move(5);
    }    
}
