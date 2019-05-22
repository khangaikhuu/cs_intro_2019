

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfRectangleTest
{
    @Test
    public void PerimeterOfRectangle()
    {
        PerimeterOfRectangle p1 = new PerimeterOfRectangle();
        assertEquals(6, p1.PerimeterOfRectangle(1,2));
        assertEquals(10, p1.PerimeterOfRectangle(2,3));
        assertEquals(14, p1.PerimeterOfRectangle(3,4));
    }
}
