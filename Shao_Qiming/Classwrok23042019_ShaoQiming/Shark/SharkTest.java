

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
    @Test
    public void testMyMethod()
    {
        Shark c1 = new Shark();
        assertEquals(false, c1.getFalse(true));
        assertEquals(true, c1.getFalse(false));
        assertEquals(200, c1.addNum(100));
        assertEquals(110, c1.addNum(10));
    }
}
