

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkLoopTest
{
    @Test
    public void testForLoop()
    {
        ClassworkLoop cl = new ClassworkLoop();
        assertEquals(20, cl.loop.loopNumbers(10));
    }
}
