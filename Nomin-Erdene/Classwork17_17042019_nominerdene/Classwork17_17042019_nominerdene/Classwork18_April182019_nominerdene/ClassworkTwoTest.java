

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo(6,2);
        assertEquals(6, c2.getA());
        assertEquals(2, c2.getB());
        assertEquals(8, c2.getSum());
        assertEquals(12, c2.getQuotient());
      
    }
}
