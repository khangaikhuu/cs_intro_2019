

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ptTest
{
    @Test
    public void testThisMethod()
    {
        pt c1 = new pt();
        assertEquals(1.414213562, c1.calc(1, 1), 0.01);
        assertEquals(2.236067977, c1.calc(2, 1), 0.01);
        assertEquals(3.605551275, c1.calc(2, 3), 0.01);
    }
}
