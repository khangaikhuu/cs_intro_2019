

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfTheCircleTest
{
    @Test
    public void testAreaCircle()
    {
        AreaOfTheCircle a1 = new AreaOfTheCircle();
        assertEquals(3, a1.Area(1), 1);
        assertEquals(50.24, a1.Area(4), 1);
        assertEquals(153.86, a1.Area(7), 1);
    }
}
