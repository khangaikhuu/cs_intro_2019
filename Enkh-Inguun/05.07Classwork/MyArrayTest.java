

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{
    @Test
    public void testArray()
    {
        MyArray ma = new MyArray ();
        assertEquals (5, ma.getSizeOfmyArray1());
        assertEquals (5, ma.getSizeofMyDoubleArray());
        assertEquals (0, ma.getElement());
        assertEquals (1.5, ma.getElement2(),1);
        
    }
}
