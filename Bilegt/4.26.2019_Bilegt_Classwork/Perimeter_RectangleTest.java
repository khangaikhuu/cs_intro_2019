

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Perimeter_RectangleTest
{
    @Test
    public void testThisMethod()
    {
        Perimeter_Rectangle obj1 = new Perimeter_Rectangle();
        assertEquals(4, obj1.Perimeter_Calc(1, 1), 0.01);
        assertEquals(10, obj1.Perimeter_Calc(2, 3), 0.01);
        assertEquals(18, obj1.Perimeter_Calc(5.6, 3.4), 0.01);
    }
}
