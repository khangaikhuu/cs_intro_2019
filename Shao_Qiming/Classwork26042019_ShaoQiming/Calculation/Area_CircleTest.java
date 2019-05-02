

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Area_CircleTest
{
   @Test
   public void Area_CircleCalc()
   {
       Area_Circle obj1 = new Area_Circle();
       assertEquals(3.14159265359, obj1.areaCalc(1), 0.000000001);
       assertEquals(12.56637061, obj1.areaCalc(2), 0.001);
       assertEquals(28.27433388, obj1.areaCalc(3), 0.001);
   }
}
