

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
     @Test
    public void testMyMethod()
    {
        ClassworkTwo c1 = new ClassworkTwo(0.0f, 0.0);
        assertEquals(0, c1.getF(), 1);
        assertEquals(0, c1.getD(), 1);
        assertEquals(0, c1.getF(), 1);
        assertEquals(0, c1.getD(), 1);
        //the "set" methods are void type which has no return, so I can't test them//
        
        
    }
}
