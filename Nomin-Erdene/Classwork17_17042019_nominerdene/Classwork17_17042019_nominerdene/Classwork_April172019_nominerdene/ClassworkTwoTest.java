

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test 
    public void testClassworkTwo()
    {
        ClassworkTwo c4 = new ClassworkTwo(10.5f,2.5);
        assertEquals(10.5f, c4.getA(10.5f));
        assertEquals(2.5, c4.getB(2.5));
    }
}
