

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void TestMyMethod()
    {
        ClassworkTwo c2 = new ClassworkTwo(2, "Cho", 3.5);
        assertEquals(2, c2.getA());
        assertEquals("Cho", c2.getB());
        assertEquals(3.5, c2.getC(), 1);
        assertEquals(20, c2.loopNumbers(10));
    }
}
