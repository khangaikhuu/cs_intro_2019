

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{
    @Test
    public void testMyMethod()
    {
        MyArray m1 = new MyArray();
        assertEquals(5, m1.getSidesOfmyArray1());
        assertEquals(5.0, m1.getSidesOfmyDoubleArray1(), 1);
        assertEquals(0, m1.getElement());
        assertEquals(2.0, m1.getElement2(), 1);
    }
}
