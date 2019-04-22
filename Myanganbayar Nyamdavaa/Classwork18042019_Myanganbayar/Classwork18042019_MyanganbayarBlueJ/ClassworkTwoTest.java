

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c1 = new ClassworkTwo(1, 2);
        
        assertEquals(10, c1.loopNumbers(5));
        assertEquals(5, c1.getSum());
        assertEquals(4, c1.getProduct());
    }
}
