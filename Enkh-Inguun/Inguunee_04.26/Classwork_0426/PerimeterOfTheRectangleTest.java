

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class PerimeterOfTheRectangleTest
{
     @Test
    public void PerimeterRectangle()
    {
       PerimeterOfTheRectangle p1 = new PerimeterOfTheRectangle();
       assertEquals(6, p1.PerimeterRectangle(1,2));
       assertEquals(10, p1.PerimeterRectangle(2,3));
       assertEquals(14, p1.PerimeterRectangle(3,4));
    }
}
