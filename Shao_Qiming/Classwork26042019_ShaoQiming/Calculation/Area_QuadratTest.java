

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Area_QuadratTest
{
   @Test
    public void testThisMethod()
   {
       Area_Quadrat obj1 = new Area_Quadrat();
       assertEquals(6, obj1.Area_Calc(2, 3), 0.1);
       assertEquals(7.36, obj1.Area_Calc(2.3, 3.2), 0.1);
       assertEquals(33.8, obj1.Area_Calc(5.2, 6.5), 0.1);
   }
}
