

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfCircleTest
{
    @Test
    public void testPerimeterOfCircle() 
    { 
        PerimeterOfCircle c4 = new PerimeterOfCircle();
        assertEquals(18.84, c4.PerimeterOfCircle(3), 1); 
        assertEquals(37.68, c4.PerimeterOfCircle(6), 1);
        assertEquals(43.96, c4.PerimeterOfCircle(7), 1); 
    } 
        
    
}
