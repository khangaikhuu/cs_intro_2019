

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{ 
    @Test 
    public void testMyMethod()
    {
        GiveMeMyElement e1 = new GiveMeMyElement();
        assertEquals(2, e1.getElement(1));
        assertEquals(25, e1.getElement(5));
        assertEquals(23, e1.getElement(6));
    }
        
 
}
