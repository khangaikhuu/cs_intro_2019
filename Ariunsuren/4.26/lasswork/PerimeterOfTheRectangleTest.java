

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfTheRectangleTest
{
   @Test
    public void testPerimeterRectangle()
    {
        PerimeterOfTheRectangle a2 = new PerimeterOfTheRectangle();
        assertEquals(12, a2.Perimeter(2,4));
        assertEquals(6, a2.Perimeter(1,2));
        assertEquals(18, a2.Perimeter(4,5));
    }
     
}
