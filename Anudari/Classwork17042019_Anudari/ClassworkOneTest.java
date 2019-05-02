

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void testClassworkOne()
    {
        ClassworkOne c1 = new ClassworkOne(5,false,"Hello");
        assertEquals(5, c1.getA());
        assertEquals(false, c1.getB());
        assertEquals("Hello", c1. getC());
    }
        
    
}
