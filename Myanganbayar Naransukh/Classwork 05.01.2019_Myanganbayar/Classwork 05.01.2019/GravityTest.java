

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GravityTest
{
    @Test
    public void testGravity()
    {
        Gravity v1 = new Gravity();
        assertEquals(4.0, v1.getGravity(2.0, 2.0, 1.0, 1.0), 1);
        assertEquals(12.0, v1.getGravity(2.0, 3.0, 2.0, 2.0), 1);
        assertEquals(200.0, v1.getGravity(10.0, 5.0, 5.0, 4.0), 1);
    }
}
