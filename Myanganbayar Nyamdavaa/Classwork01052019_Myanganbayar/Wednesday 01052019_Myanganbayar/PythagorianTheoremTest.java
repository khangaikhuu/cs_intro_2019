

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    @Test
    public void TestPythagorianTheorem()
    {
        PythagorianTheorem c1 = new PythagorianTheorem();
        assertEquals(1.41, c1.PythagorianTheorem(1, 1), 1);
        assertEquals(2.83, c1.PythagorianTheorem(2, 2), 1);
        assertEquals(4.24, c1.PythagorianTheorem(3, 3), 1);
    }
}
