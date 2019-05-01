

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterCircleTest
{
   @Test 
   public void testPerimeterCircle()
   {
       PerimeterCircle p1 = new PerimeterCircle();
       assertEquals(6.28, p1.Perimeter(1), 1);
       assertEquals(12.56, p1.Perimeter(2), 1);
       assertEquals(18.84, p1.Perimeter(3), 1);
    }
}
