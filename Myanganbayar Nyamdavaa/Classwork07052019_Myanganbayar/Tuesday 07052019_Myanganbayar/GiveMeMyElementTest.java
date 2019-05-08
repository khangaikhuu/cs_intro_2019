

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
    @Test
    public void testArray()
    {
        GiveMeMyElement ma = new GiveMeMyElement();
        assertEquals (3, ma.getMyArray(2));
        assertEquals (4, ma.getMyArray(3));
        assertEquals (19, ma.getMyArray(4));
    }
}
