

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    @Test
    public void TestMyMethod()
    {
        PythagorianTheorem p1 = new PythagorianTheorem();
        assertEquals(5.0, p1.getC(3,4), 1);
        assertEquals(9.219544457292887, p1.getC(6,7), 1);
        assertEquals(9.219544457292887, p1.getC(9,2), 1);
    }
}
