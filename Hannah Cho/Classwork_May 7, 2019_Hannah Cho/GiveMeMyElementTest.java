

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
    @Test
    public void testMyMethod()
    {
        GiveMeMyElement g1 = new GiveMeMyElement();
        assertEquals(11, g1.getSizeOfmyIntElement());
        assertEquals(11, g1.getSizeOfmyIntElement());  
        assertEquals(2, g1.getIndex(1));
    }
}
