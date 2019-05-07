

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
    @Test
    public void testMySize()
    {
        GiveMeMySize ma = new GiveMeMySize();
        assertEquals(11, ma.getGiveMeMySize1());
        int [] myArray1 = {1, 2, 3};
        assertEquals(3, ma.getSize(myArray1));
        int [] myArray2 = {1, 2, 3, 4};
        assertEquals(4, ma.getSize(myArray2));
        int [] myArray3 = {1, 2, 3, 4, 5};
        assertEquals(5, ma.getSize(myArray3));
        int [] myArray4 = {1, 2, 3, 4};
        assertEquals(4, ma.getSize(myArray4));
        int [] myArray5 = {1, 2};
        assertEquals(2, ma.getSize(myArray5));
    }
}
