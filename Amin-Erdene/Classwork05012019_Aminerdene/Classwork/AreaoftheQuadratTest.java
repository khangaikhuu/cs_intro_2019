

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AreaoftheQuadratTest
{
   @Test
   public void testAreaoftheQuadrat()
   {
    AreaoftheQuadrat c4 = new AreaoftheQuadrat();
    assertEquals(4, c4.AreaoftheQuadrat(2));
    assertEquals(9, c4.AreaoftheQuadrat(3));
    assertEquals(16, c4.AreaoftheQuadrat(4));
    }
}
