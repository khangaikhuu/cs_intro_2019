

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void testForLoop()
    {
        ClassworkOne co = new ClassworkOne();
        
        assertEquals (1, co.getA());
        assertEquals (10, co. loopNumbers(5));
        assertEquals (5, co. loopNumbers(3));
    }
}
