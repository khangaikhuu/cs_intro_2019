

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterofRectangleTest
{
      @Test 
   public void testMyMethod()
   {
       PerimeterofRectangle c1 = new PerimeterofRectangle();
       assertEquals(10,c1.getArea(2,3), 1);
       assertEquals(14,c1.getArea(4,3), 1);
       assertEquals(12,c1.getArea(1,5), 1);
    
     
}
}
