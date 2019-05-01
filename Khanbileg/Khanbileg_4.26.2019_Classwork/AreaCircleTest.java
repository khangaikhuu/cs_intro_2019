

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaCircleTest
{
    @Test
    public void testAreaCircle()
    {
        AreaCircle c1 = new AreaCircle();
        assertEquals(12.56, c1.Area(2), 1);
        assertEquals(3, c1.Area(1), 1);
        assertEquals(50.24, c1.Area(4), 1);
    }
}
