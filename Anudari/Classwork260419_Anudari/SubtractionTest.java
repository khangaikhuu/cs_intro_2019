

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubtractionTest
{
   @Test 
   public void testMyMethod()
   {
       Subtraction s1 = new Subtraction(); 
       assertEquals(6, s1.getSubtraction(10,4), 1);
       assertEquals(121, s1.getSubtraction(180,59), 1);
       assertEquals(0, s1.getSubtraction(3,3), 1);
    }
       
}
