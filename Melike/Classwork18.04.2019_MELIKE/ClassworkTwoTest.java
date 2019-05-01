

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
   @Test
    public void testMyMethod()
    {
        ClassworkTwo c2 = new ClassworkTwo(2, 3);
        assertEquals(0, c2.getAnswer(0));
        assertEquals(0, c2.getAnswer(0));
        assertEquals(0, c2.getAnswer(0));
        assertEquals(6, c2.getSum(3, 3));
        assertEquals(9, c2.getMult(3, 3));
        
    }
}
