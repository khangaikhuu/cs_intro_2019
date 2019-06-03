

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q8Test
{
    @Test
    public void testMyMethod()
    {
        Q8 c1 = new Q8();
        assertEquals(1, c1.calc(1, 1));
        assertEquals(0, c1.calc(0, 0));
        assertEquals(-7, c1.calc(1, 0));
    }
}
