

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q10Test
{
    @Test
    public void Test()
    {
        Q10 c1 = new Q10();
        assertEquals(true, c1.findMyElement(12.3));
        assertEquals(false, c1.findMyElement(1.1));
        assertEquals(true, c1.findMyElement(3.6));
    }
    
}
