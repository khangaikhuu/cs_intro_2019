

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{
    @Test
    public void testMyArray()
    {
        MyArray ma = new MyArray();
        assertEquals(5, ma.getSizeOfmyArray1());
        assertEquals(5, ma.getSizeOfmyArray());
        assertEquals(0, ma.getElement());
        assertEquals(0.0, ma.getElement2(), 1);
    }
}