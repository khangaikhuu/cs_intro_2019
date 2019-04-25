

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test 
    public void testMyMethod()
    {
        ClassworkTwo c1 = new ClassworkTwo (20,10);
        assertEquals( 20,c1.getA());
        assertEquals( 10,c1.getB());
        assertEquals( 30,c1.getSum());
        assertEquals ( 200,c1.getQuotient());
        assertEquals(1,c1.loopnumbers(1));
        
        
    }
}
