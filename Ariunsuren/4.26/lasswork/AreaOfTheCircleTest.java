

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
        assertEquals(12.56, a1.Area(2), 1);
        assertEquals(3, a1.Area(1), 1);
        assertEquals(50.24, a1.Area(4), 1);
    }
}
