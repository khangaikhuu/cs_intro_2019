

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
    @Test
    public void testMyMethod()
    {
        MyLoop c1 = new MyLoop();
        assertEquals(100, c1.getLoop(10));
    }
    
}
