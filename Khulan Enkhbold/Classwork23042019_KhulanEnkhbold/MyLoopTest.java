

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
    @Test
    public void testMyLoop()
    {
        MyLoop cl = new MyLoop();
        assertEquals (0, cl.getLoop(0));  
    }
}
