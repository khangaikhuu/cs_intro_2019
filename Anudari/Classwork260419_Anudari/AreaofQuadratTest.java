

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaofQuadratTest
{
     @Test 
   public void testMyMethod()
   {
       AreaofQuadrat c1 = new AreaofQuadrat();
    
     assertEquals(4, c1.getArea(2), 1);
     assertEquals(9, c1.getArea(3), 1);
     assertEquals(16, c1.getArea(4), 1);
}
}
    

