

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateSubtractionTest
{
    @Test
    public void TestMyMethod()
    {
        CalculateSubtraction c1 = new CalculateSubtraction();
        assertEquals(6, c1.getSubtraction(8, 2), 1);
        assertEquals(2, c1.getSubtraction(4, 2), 1);
        assertEquals(8, c1.getSubtraction(9, 1), 1);
    }
}
