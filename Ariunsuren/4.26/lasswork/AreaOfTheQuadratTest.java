

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfTheQuadratTest
{
   @Test
    public void testAreaQuadrat()
    {
        AreaOfTheQuadrat a2 = new AreaOfTheQuadrat();
        assertEquals(4.83, a2.Area(2.1), 1);
        assertEquals(1.44, a2.Area(1.2), 1);
        assertEquals(16.0, a2.Area(4.0), 1);
    }
}
