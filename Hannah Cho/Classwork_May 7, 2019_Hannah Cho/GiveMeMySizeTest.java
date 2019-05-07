

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
    @Test
    public void testMyMethod()
    {
        GiveMeMySize s1 = new GiveMeMySize();
        assertEquals(11, s1.getSize());
        assertEquals(11, s1.getSize());
        assertEquals(11, s1.getSize());
        int[] test1 = {1,2,3,4};
        assertEquals(4, s1.getSize2(test1));
        int[] test2 = {1,2,3,4,5,5};
        assertEquals(6, s1.getSize2(test2));
        int[] test3 = {1,2,5};
        assertEquals(3, s1.getSize2(test3));
    }
}
