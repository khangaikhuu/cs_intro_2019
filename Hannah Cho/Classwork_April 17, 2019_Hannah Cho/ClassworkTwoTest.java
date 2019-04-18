

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c1 = new ClassworkTwo(1.0f,2.0);
        assertEquals(1.0f, c1.getA(),1);
        assertEquals(2.0, c1.getB(),2);
    }
    
}
