

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{
    @Test
    public void testMyMethod()
    {
        MyArray ma = new MyArray();
        assertEquals(5, ma.getSizeOfArray1());
        assertEquals(5, ma.getSizeOfmyDoubleArray());
        assertEquals(0, ma.getElement());
        assertEquals(2.0, ma.getElement2(), 1);
    }
}
