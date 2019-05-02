

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelativityTest
{
    @Test
    public void testThisMethod()
    {
        LawOfRelativity c1 = new LawOfRelativity();
        assertEquals(8.987551787368176E16, c1.relativity(1), 0.00000001);
        assertEquals(1.7975103574736352E17, c1.relativity(2), 0.00000001);
        assertEquals(2.6962655362104528E17, c1.relativity(3), 0.00000001);
    }
}
