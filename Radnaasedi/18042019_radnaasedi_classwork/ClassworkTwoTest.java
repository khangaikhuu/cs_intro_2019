

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
  @Test
    public void testMyMethod()
    {
        ClassworkTwo c1 = new ClassworkTwo(2, 3);
        assertEquals(6, c1.getProduct(2, 3));
        assertEquals(42, c1.getProduct(6, 7));
        assertEquals(12, c1.getProduct(3, 4));
        assertEquals(121, c1.getProduct(11, 11));
        assertEquals(144, c1.getProduct(12, 12));
    }
        
    
    
    
}
