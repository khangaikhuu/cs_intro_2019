

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
        assertEquals(6, ma.getMySize());
    }
}
