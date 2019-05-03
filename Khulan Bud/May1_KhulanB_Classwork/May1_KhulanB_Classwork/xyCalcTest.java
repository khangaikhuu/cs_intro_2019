


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class xyCalcTest
{
   @Test
   public void testXyCalc()
   {
       xyCalc q1 = new xyCalc();
       assertEquals(8,q1.calcF(2,2));
       assertEquals(13,q1.calcF(2,3));
       assertEquals(17,q1.calcF(1,4));
    }
}