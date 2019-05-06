import greenfoot.*; 
public class player extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")){
            turn(8);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(8);
        }
        move(3);
    }    
}
