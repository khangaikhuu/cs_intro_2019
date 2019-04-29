
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MyLoopTest
{
    @Test
    public void testMyMethod()
    {
     MyLoop m1 = new MyLoop();
     assertEquals(0, m1.GetLoop(0));
    }
}
