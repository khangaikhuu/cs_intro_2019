

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThanTest
{
    @Test
    public void testLess()
    {
        LessThan lt = new LessThan();
        assertEquals(true, lt.smaller(32,54));
        assertEquals(false, lt.smaller(369,37));
        assertEquals(true, lt.smaller(12,2));
    }
}
