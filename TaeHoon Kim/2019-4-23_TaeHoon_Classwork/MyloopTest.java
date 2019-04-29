

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyloopTest
{
    @Test
    public void testForMyloop()
    {
        Myloop m1 = new Myloop();
        assertEquals(20, m1.getLoop(2));
    }
}
