

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfTheCircleTest
{
    @Test
   public void testPerimeterCircle()
   {
     PerimeterOfTheCircle p1 = new PerimeterOfTheCircle();
     assertEquals(12.56, p1.Perimeter(2),1);
     assertEquals(6.28, p1.Perimeter(1), 1);
     assertEquals(18.84, p1.Perimeter(3), 1);
   }
}
