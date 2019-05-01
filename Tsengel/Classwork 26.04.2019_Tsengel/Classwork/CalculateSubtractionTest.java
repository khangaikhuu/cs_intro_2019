
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateSubtractionTest
{
    @Test
    public void testcalcSubtraction()
    {
        CalculateSubtraction a2 = new CalculateSubtraction();
        assertEquals(0, a2.calcSubtraction(4,4));
        assertEquals(5, a2.calcSubtraction(6,1));
        assertEquals(3, a2.calcSubtraction(6,3));
    }
}
