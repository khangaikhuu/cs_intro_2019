

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
    @Test
    public void testMyLoop()
    {
        MyLoop l1 = new MyLoop ();
        assertEquals(0,l1.getA());
        assertEquals(0,l1.loopnumbers(0));
}
}
