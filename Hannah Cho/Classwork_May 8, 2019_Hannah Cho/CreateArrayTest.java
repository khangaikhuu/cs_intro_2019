

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
        ca.createArray(0,5);
        assertEquals(5, ca.getElement(0));
        ca.createArray(2,3);
        assertEquals(3, ca.getElement(2));
        ca.createArray(4,6);
        assertEquals(6, ca.getElement(4));
    }
    
}
