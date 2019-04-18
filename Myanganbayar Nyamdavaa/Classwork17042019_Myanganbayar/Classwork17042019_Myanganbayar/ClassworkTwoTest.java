

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testMethod()
    {
        ClassworkTwo ct = new ClassworkTwo(15, 30);
        
        assertEquals(15, ct.getA(), 1);
        assertEquals(15, ct.setA(), 1);
        assertEquals(30, ct.getB(), 1);
        assertEquals(30, ct.setB(), 1);
    }
}
