


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EqualTest
{
    @Test
    public void testEqual()
    {
        Equal q1 = new Equal();
        assertEquals(true,q1.checkEqual(10,10));
        assertEquals(false,q1.checkEqual(1,3));
        assertEquals(true,q1.checkEqual(4,4));
    }
}