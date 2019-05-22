

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GiveMeMyElementTest
{
    @Test
    public void testMyElement()
    {
        GiveMeMyElement ma = new GiveMeMyElement();
        assertEquals(1, ma.getIndex(0));
        assertEquals(5, ma.getIndex(25));
        assertEquals(3, ma.getIndex(4));
    }
}
