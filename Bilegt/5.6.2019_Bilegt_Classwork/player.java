import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class player extends Actor
{

    /**
     * Act - do whatever the player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
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
