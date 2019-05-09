

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
    @Test 
    public void testCreateArray()
    {
        CreateArray ma = new CreateArray();
       ma.ChangeMyValue(3,0);
       assertEquals(3, ma.getElement(0));
       ma.ChangeMyValue(2,1);
       assertEquals(2, ma.getElement(1));
       ma.ChangeMyValue(6,2);
       assertEquals(6, ma.getElement(2));
      
    }
}
