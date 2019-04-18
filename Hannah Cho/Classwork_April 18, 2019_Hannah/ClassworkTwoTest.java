

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkOne c1 = new ClassworkOne(1.0f, 2.5);
        assertEquals(1.0f, c1.getA(),1);
        assertEquals(2.5, c1.getB(),2.5);
    }
}