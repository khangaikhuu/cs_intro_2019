

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkOne Myangaa = new ClassworkOne(10, true, "Hello");
        
        assertEquals (10, Myangaa.getA());
        assertEquals (true, Myangaa.getB());
        assertEquals ("Hello", Myangaa.getC());
    }
}
