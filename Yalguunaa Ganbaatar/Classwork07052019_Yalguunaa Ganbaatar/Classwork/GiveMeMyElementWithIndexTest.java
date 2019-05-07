

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
        int[] test1 = {1, 2, 3, 4};
        assertEquals(3, ma.getElement(2, test1));
        int[] test2 = {1, 25, 3};
        assertEquals(25, ma.getElement(1, test2));
        int[] test3 = {12, 4, 2, 3};
        assertEquals(12, ma.getElement(0, test3));
    }
}
