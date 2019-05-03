

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualsTest
{
    @Test
    public void testEquals()
    {
        Equals q1 = new Equals();
        assertEquals(true,q1.Equals(10,10));
        assertEquals(false,q1.Equals(1,3));
        assertEquals(true,q1.Equals(4,4));
    }
}
