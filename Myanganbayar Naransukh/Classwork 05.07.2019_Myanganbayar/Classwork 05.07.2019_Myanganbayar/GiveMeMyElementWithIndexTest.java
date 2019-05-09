

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    @Test 
    public void testGiveMeMyElementWithIndex()
    {
        GiveMeMyElementWithIndex ma = new GiveMeMyElementWithIndex();
        int [] myArray = {1, 2, 3, 5};
        assertEquals(5, ma.getIndex(3, myArray));
        assertEquals(3, ma.getIndex(2, myArray));
        assertEquals(2, ma.getIndex(1, myArray));
    }
}
