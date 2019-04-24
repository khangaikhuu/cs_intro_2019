

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test 
    public void testMyMethod()
    {
        ClassworkTwo c1 = new ClassworkTwo(10.0f,10.0);
        assertEquals(10.0f, c1.getA(), 2);
        assertEquals(10.0, c1.getB(), 1);
        
     
    }
}
