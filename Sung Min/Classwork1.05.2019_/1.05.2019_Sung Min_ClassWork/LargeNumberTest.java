

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LargeNumberTest
{
    @Test
    public void testLarger()
    {
        LargeNumber ln = new LargeNumber();
        assertEquals(5, ln.Larger(5,1));
        assertEquals(9, ln.Larger(9,3));
        assertEquals(10, ln.Larger(1,10));
    }
}
