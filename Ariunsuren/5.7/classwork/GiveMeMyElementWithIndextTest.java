

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndextTest
{
    @Test 
    public void testMyArray()
    {
        GiveMeMyElementWithIndex c1 = new GiveMeMyElementWithIndex();
        assertEquals(25, c1.getElementOfMyArray(5));
        
    }
}
