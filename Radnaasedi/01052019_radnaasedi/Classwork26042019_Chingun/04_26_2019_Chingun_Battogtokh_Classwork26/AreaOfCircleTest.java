

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfCircleTest
{
    @Test 
    public void testAreaOfCircle() 
    { 
        AreaOfCircle c4 = new AreaOfCircle();
        assertEquals(72.2, c4.AreaOfCircle(23), 1); 
        assertEquals(37.68, c4.AreaOfCircle(12), 1); 
        assertEquals(100.48, c4.AreaOfCircle(32), 1); 
    }
        
    
}
