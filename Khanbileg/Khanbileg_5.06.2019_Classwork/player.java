import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class player extends Actor
{

    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(12);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(-12);
        }
        move(1);
    }
}
