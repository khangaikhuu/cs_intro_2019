
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLoopTest
{
    @Test
    public void testMyLoopTest()
    {
        MyLoop m = new MyLoop();
        assertEquals(10, m.getLoop(1));
    }
}
