

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfGravityTest
{
    
    @Test
    public void testThisMethod()
    {
        LawOfGravity c1 = new LawOfGravity();
        assertEquals(7.415644444444443E-12, c1.CalcGravity(1, 1, 1), 0.00000001);
        assertEquals(6.674079999999999E-11, c1.CalcGravity(2, 2, 2), 0.00000001);
        assertEquals(6.674079999999999E-11, c1.CalcGravity(3, 3, 3), 0.00000001);
    }
}
