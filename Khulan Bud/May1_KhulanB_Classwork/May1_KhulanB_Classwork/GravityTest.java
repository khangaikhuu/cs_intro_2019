

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GravityTest
{
    @Test
    public void testThisMethod()
    {
        Gravity c1 = new Gravity();
        assertEquals(0.074156444, c1.CalcGravity(10000000, 10000000, 300), 0.00000001);
        assertEquals(1.186503111, c1.CalcGravity(120000000, 120000000, 900), 0.00000001);
        assertEquals(0.8618392739, c1.CalcGravity(20000005, 20000005, 176), 0.00000001);
    }
}
