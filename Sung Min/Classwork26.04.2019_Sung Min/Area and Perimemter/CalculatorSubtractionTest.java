

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorSubtractionTest
{
    @Test
    public void testcalcSubtraction()
    {
        CalculatorSubtraction cs = new CalculatorSubtraction();
        assertEquals(0, cs.calcSubtraction(4,4));
        assertEquals(5, cs.calcSubtraction(6,1));
        assertEquals(3, cs.calcSubtraction(6,3));
    }
}
