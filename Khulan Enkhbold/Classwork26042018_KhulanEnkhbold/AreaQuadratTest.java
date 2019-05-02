

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AreaQuadratTest
{
   @Test
   public void AreaQuadrat()
   {
       AreaQuadrat a1 = new AreaQuadrat();
       assertEquals(1, a1.Area(1), 1);
       assertEquals(4, a1.Area(2), 1);
       assertEquals(9, a1.Area(3), 1);
    }
}
