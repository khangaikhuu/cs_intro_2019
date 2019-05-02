

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateFTest
{
    @Test
    public void TestMyMethod()
    {
        CalculateF c1 = new CalculateF();
        assertEquals(85.0, c1.getF(2,9), 1);
        assertEquals(41.0, c1.getF(4,5), 1);
        assertEquals(73.0, c1.getF(8,3), 1);
    }
}
