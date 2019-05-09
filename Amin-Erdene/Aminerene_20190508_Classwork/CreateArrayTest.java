

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreateArrayTest
{
    @Test
    public void testMyMethod()
    {
        CreateArray ma = new CreateArray();
        ma.CreateArray(1,2);
        assertEquals(2, ma.getElement(1));
        ma.CreateArray(2,5);
        assertEquals(5, ma.getElement(2));
        ma.CreateArray(4,6);
        assertEquals(6, ma.getElement(4));
    }
}
