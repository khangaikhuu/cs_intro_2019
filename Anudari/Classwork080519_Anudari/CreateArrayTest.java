

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
    @Test
    public void TestMyMethod()
    {
        CreateArray a1 = new CreateArray();
        a1.createArray(0,5);
        assertEquals(5, a1.getElement(0));
        a1.createArray(2,3);
       assertEquals(3, a1.getElement(2));
      
       a1.createArray(4,6);
        assertEquals(6, a1.getElement(4));
    }
}
