

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo();
        assertEquals(, c2.getA());
        assertEquals(, c2.getSum());
        assertEquals(, c2.getQuotient());
        c2.setA(0);
        assertEquals(1, c2.loopnumber());
    }
}
