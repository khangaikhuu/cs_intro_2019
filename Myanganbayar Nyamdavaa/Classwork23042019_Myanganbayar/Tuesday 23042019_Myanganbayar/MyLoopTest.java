

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
    @Test
    public void TestMyLoop()
    {
        MyLoop n1 = new MyLoop();
        assertEquals (0, n1.GetLoop(0));
    }
}
