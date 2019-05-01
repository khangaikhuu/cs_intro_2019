
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterCalcTest
{
    @Test
    public void testThisMethod()
    {
        PerimeterCalc obj1 = new PerimeterCalc();
        assertEquals(6.283185307, obj1.PerimeterCalc(1), 0.1);
        assertEquals(12.56637061, obj1.PerimeterCalc(2), 0.1);
        assertEquals(18.84955592, obj1.PerimeterCalc(3), 0.1);
    }
}
