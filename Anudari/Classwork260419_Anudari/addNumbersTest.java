

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class addNumbersTest
{
   @Test 
   public void testMyMethod()
   {
       addNumbers a1 = new addNumbers();
    
     assertEquals(11, a1.getSum(2,4,5), 1);
     assertEquals(9, a1.getSum(3,3,3), 1);
     assertEquals(136, a1.getSum(4,123,9), 1);
}
}
