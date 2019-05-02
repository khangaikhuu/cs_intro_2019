

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
        assertEquals(6.2912862511577229E17, c1.relativity(7), 1); 
        assertEquals(1.7975103574736352E17, c1.relativity(2), 1); 
        assertEquals(8.99, c1.relativity(0.0000000000000001), 1);
    }
}
