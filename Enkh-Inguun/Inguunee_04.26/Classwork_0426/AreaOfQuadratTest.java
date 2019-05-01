

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfQuadratTest
{
    @Test
   public void AreaQuadrat()
   {
      AreaOfQuadrat a1 = new AreaOfQuadrat();
      assertEquals(1, a1.Area(1),1);
      assertEquals(4, a1.Area(2),1);
      assertEquals(9, a1.Area(3),1);
   } 
}
