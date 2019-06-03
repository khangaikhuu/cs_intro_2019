

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GiveMeMyElementTest
{
    @Test
    public void testGiveMeMyElement()
    {
        GiveMeMyElement ma = new GiveMeMyElement();
        assertEquals(2, ma.getIndex(1));
        assertEquals(19, ma.getIndex(4));
        assertEquals(3, ma.getIndex(2));
    }
}
