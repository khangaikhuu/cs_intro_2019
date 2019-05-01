

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterCircleTest
{
    @Test
    public void testMyMethod ()
    {
        PerimeterCircle a1 = new PerimeterCircle();
        assertEquals(12.56, a1.Perimeter(2), 1);
        assertEquals(18.84, a1.Perimeter(3), 1);
        assertEquals(25.12, a1.Perimeter(4), 1);
    }
}
