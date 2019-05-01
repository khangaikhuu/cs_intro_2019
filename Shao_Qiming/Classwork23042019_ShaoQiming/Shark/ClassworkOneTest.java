

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testThisMethod()
    {
        ClassworkOne obj1 = new ClassworkOne(1, "something");
        assertEquals(1, obj1.getA(1));
        assertEquals(2, obj1.getA(2));
        assertEquals(3, obj1.getA(3));
        assertEquals("something", obj1.getB("something"));
        assertEquals("haha world", obj1.getB("haha world"));
        assertEquals("anything", obj1.getB("anything"));
        
    }
}
