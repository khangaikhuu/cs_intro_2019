

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
    @Test
    public void testMyArray()
    {
        GiveMeMyElement m = new GiveMeMyElement();
        assertEquals(2, m.getIntdex(1));
        assertEquals(3, m.getIntdex(2));
        assertEquals(19, m.getIntdex(3));
    }
}
