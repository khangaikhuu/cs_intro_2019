

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    
   @Test
    public void testArray()
    {
        GiveMeMyElementWithIndex ma = new GiveMeMyElementWithIndex ();
        int [] t1 = {2,4,5};
        assertEquals (4, ma.getMyElement(1, t1));
        int [] t2 = {3, 7, 6};
        assertEquals (3, ma.getMyElement(0, t2));
        int [] t3 = {4, 8, 0};
        assertEquals (8, ma.getMyElement(1, t3));

    
}
}
