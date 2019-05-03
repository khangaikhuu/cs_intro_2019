

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateSumTest
{
    @Test
    public void TestMyMethod()
    {
        CalculateSum c1 = new CalculateSum();
        assertEquals(4952, c1.loopNumbers(2));
    }
}
