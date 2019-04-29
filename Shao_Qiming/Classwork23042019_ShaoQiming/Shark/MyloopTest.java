

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyloopTest
{
    @Test
    public void testMyMethod()
    {
        Myloop c1 = new Myloop();
        assertEquals(100, c1.getLoop(10));
        assertEquals(110, c1.getLoop(11));
        assertEquals(120, c1.getLoop(12));
        assertEquals(90, c1.getLoop(9));
    }
}
