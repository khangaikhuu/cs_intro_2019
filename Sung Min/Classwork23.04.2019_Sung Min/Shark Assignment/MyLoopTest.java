import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLoopTest
{
    @Test
    public void testForMyLoop()
    {
        MyLoop ml = new MyLoop();
        assertEquals(20, ml.getLoop(2));
    }
}