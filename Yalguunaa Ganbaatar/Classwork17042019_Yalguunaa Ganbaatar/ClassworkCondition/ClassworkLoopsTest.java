

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkLoopsTest
{
    @Test
    public void testForLoops()
    {
        ClassworkLoops c1 = new ClassworkLoops();
        assertEquals(20, c1.loopNumbers(10));
    }
}
