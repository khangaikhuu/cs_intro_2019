

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Perimeter_CalcTest
{
    @Test
    public void testThisMethod()
    {
        Perimeter_Calc obj1 = new Perimeter_Calc();
        assertEquals(6.283185307, obj1.Perimeter_calc(1), 0.1);
        assertEquals(12.56637061, obj1.Perimeter_calc(2), 0.1);
        assertEquals(18.84955592, obj1.Perimeter_calc(3), 0.1);
    }
}
