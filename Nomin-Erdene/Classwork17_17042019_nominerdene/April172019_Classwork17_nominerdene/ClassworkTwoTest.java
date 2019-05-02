

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo(1.4f, 2.5);
        assertEquals(1.4f, c2.getA(1.4f), 1);
        assertEquals(2.5, c2.getB(2.5), 1);
    }
}
