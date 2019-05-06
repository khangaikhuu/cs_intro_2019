import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class LawOfRelativityTest
{
    @Test 
    public void testRelativity()
    {
        LawOfRelativity r = new LawOfRelativity();
        assertEquals(98.0, r.getE(2,7), 1);
        assertEquals(100.0, r.getE(4,5), 1);
        assertEquals(324.0, r.getE(9,6), 2);
    }
}
