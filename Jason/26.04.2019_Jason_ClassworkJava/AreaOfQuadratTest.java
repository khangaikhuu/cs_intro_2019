import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AreaOfQuadratTest
{
   @Test 
   public void testAreaOfQuad()
   {
       AreaOfQuadrat a2 = new AreaOfQuadrat();
       assertEquals(4.83, a2.Area(2.1), 1);
       assertEquals(1.44, a2.Area(1.2), 1);
       assertEquals(16.0, a2.Area(4.0), 1);
    }
}
