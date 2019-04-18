

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void testMethod()
    {
        ClassworkOne co = new ClassworkOne();
        
        assertEquals (1, co.setA(1), 1);
        assertEquals (2, co.setA(1), 1);
        assertEquals (3, co.setA(1), 1);
    }
}
