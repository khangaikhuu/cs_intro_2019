

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeteroftheRectangleTest
{
    @Test
    public void TestMyMethod()
    {
        PerimeteroftheRectangle p1 = new PerimeteroftheRectangle();
        assertEquals(32.0, p1.getPerimeter(9, 7), 1);
        assertEquals(12.0, p1.getPerimeter(4, 2), 1);
        assertEquals(22.0, p1.getPerimeter(8, 3), 1);
    }
}
