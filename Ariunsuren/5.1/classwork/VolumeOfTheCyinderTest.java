

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeOfTheCyinderTest
{
   
   @Test
   public void testThisMethod()
   {
       VolumeOfTheCyinder c1 = new VolumeOfTheCyinder();
       assertEquals(3.1415926, c1.calcVolumeCylinder(1.0, 1.0), 0.1);
       assertEquals(201.0619264, c1.calcVolumeCylinder(4.0, 4.0), 0.1);
       assertEquals(25.1327408, c1.calcVolumeCylinder(2.0, 2.0), 0.1);
   }
}
