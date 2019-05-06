

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GreaterNumberTest
{
   @Test
    public void testMyMethod()
    {
        GreaterNumber l1 = new GreaterNumber();
        assertEquals(4, l1.getNumber(4,3));
        assertEquals(6, l1.getNumber(6,4));
        assertEquals(10, l1.getNumber(3,10));
    
}
}
