

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GiveMeMySizeTest
{
    @Test
    public void testGiveMeMySize()
    {
        GiveMeMySize ma = new GiveMeMySize();
        assertEquals(11, ma.getSize());
        assertEquals(11, ma.getSize());
        assertEquals(11, ma.getSize());
        int[] test1 = {1, 2, 3};
        assertEquals(3, ma.getSize2(test1));
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(7, ma.getSize2(test2));
        int[] test3 = {1, 3, 5, 2, 4};
        assertEquals(5, ma.getSize2(test3));
    }
    
}
