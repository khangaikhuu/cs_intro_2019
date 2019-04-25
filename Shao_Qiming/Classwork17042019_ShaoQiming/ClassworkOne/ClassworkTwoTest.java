

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkTwo c1 = new ClassworkTwo(1.2f, 2.3);
        assertEquals(1.2, c1.getF(1.2f), 1);
        assertEquals(2.4, c1.getD(2.4), 1);
        assertEquals(3.4, c1.getF(3.4f), 1);
        assertEquals(5.7, c1.getD(5.7), 1);
        //the "set" methods are void type which has no return, so I can't test them//
        
        
    }
}
