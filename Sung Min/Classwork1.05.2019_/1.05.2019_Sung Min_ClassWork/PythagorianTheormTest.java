

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheormTest
{
    @Test
    public void testPythagorian()
    {
        PythagorianTheorm pt = new PythagorianTheorm();
        assertEquals(4.47, pt.getC(2, 4), 1);
        assertEquals(5.0, pt.getC(3, 4), 1);
        assertEquals(12.04, pt.getC(8, 9), 1);
    }
}
