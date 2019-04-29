

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaofcircleTest
{
   @Test 
   public void testMyMethod()
   {
       Areaofcircle c1 = new Areaofcircle();
       assertEquals(3.14, c1.getT(), 1);
       assertEquals(12.57, c1.getA(2), 1);
       assertEquals(28.27, c1.getA(3), 1);
       assertEquals(50.37, c1.getA(4), 1);
}
}
