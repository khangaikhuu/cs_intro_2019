

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class PerimeteroftheCircleTest
{
   @Test
   public void testPerimeteroftheCircle()
   {
      PerimeteroftheCircle c4 = new PerimeteroftheCircle();
      assertEquals(18.84, c4.PerimeteroftheCircle(3), 1);
      assertEquals(37.68, c4.PerimeteroftheCircle(6), 1);
      assertEquals(43.96, c4.PerimeteroftheCircle(7), 1);
   }
}
