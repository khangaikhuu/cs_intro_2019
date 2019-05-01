

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfTheCircleTest
{
   
    @Test
    public void testPerimeterCircle()
    {
       PerimeterOfTheCircle a1 = new PerimeterOfTheCircle();
        assertEquals(12.56, a1.getPerimeter(2), 1);
        assertEquals(6.28, a1.getPerimeter(1), 1);
        assertEquals(25.12, a1.getPerimeter(4), 1);
    }
}
