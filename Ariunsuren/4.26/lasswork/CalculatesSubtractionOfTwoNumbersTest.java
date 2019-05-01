

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatesSubtractionOfTwoNumbersTest
{
     @Test
    public void testcalcSubtraction()
    {
        CalculatesSubtractionOfTwoNumbers a2 = new CalculatesSubtractionOfTwoNumbers();
        assertEquals(0, a2.calcSubtraction(4,4));
        assertEquals(4, a2.calcSubtraction(5,1));
        assertEquals(3, a2.calcSubtraction(6,3));
    }
}
