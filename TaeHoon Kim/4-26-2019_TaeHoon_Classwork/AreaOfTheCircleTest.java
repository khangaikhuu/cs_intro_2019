

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AreaOfTheCircleTest
{
    @Test
    public void testAreaCircle()
    {
        AreaOfTheCircle ac = new AreaOfTheCircle();
        assertEquals(12.56, ac.Area(2), 1);
        assertEquals(3, ac.Area(1), 1);
        assertEquals(50.24, ac.Area(4), 1);
    }
}
