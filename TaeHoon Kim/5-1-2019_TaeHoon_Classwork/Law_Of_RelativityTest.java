

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Law_Of_RelativityTest
{
    @Test
    public void testLaw_Of_RelativityTest()
    {
        Law_Of_Relativity r = new Law_Of_Relativity();
        assertEquals(98.0, r.getE(2,7), 1);
        assertEquals(100.0, r.getE(4,5), 1);
    }
}
