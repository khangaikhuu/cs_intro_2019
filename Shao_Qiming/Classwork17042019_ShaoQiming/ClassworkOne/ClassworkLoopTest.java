

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkLoopTest
{
    @Test
    public void testforLoop()
    {
        ClassworkLoop l1 = new ClassworkLoop();
        assertEquals(20, l1.loopNumbers(10));
    }
}
