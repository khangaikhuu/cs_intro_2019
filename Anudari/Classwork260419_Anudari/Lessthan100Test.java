

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Lessthan100Test
{
    @Test
    public void testMyMethod()
    {
        Lessthan100 l1 = new Lessthan100();
        assertEquals(true, l1.getNumber(3));
        assertEquals(false, l1.getNumber(450));
        assertEquals(true, l1.getNumber(38));
    }
      
}
