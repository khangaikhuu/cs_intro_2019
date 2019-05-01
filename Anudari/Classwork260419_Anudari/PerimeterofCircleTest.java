import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class PerimeterofCircleTest
{
   @Test 
   public void testPerimeter()
   {
      PerimeterofCircle c1 = new PerimeterofCircle();
   
      assertEquals(12.57, c1.getPerimeter(2), 1);
      assertEquals(18.85, c1.getPerimeter(3), 1);
      assertEquals(25.13, c1.getPerimeter(4), 1);
       
}
}
