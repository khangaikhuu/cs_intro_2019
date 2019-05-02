

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumOfFirstHundredNumbersTest
{
     @Test
    public void testThisMethod()
    {
        SumOfFirstHundredNumbers c1 = new SumOfFirstHundredNumbers();
        assertEquals(5050, c1.calcSum());
    }
}
