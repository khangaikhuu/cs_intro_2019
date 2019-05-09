

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
    @Test
    public void TestMyMethod()
    {
        CreateArray ma = new CreateArray();
        ma.CreateArray(1,2);
        assertEquals(2, ma.getElement(1));
        ma.CreateArray(3,2);
        assertEquals(2, ma.getElement(3));
        ma.CreateArray(5,3);
        assertEquals(3, ma.getElement(5));
    }
        
}
