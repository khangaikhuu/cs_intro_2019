

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
    @Test
    public void TestMyMethod()
    {
        CreateArray ca = new CreateArray();
        ca.CreateArray(1, 2);
        assertEquals(2, ca.getElement(1));
        ca.CreateArray(2, 5);
        assertEquals(5, ca.getElement(2));
        ca.CreateArray(4, 6);
        assertEquals(6, ca.getElement(4));
    }
}
