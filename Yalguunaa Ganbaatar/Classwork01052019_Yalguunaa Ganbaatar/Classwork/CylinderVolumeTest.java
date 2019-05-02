

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CylinderVolumeTest
{
   @Test
   public void testCylinderVolume()
   {
       CylinderVolume l1 = new CylinderVolume();
       assertEquals(6.28,l1.calcVolume(1,2), 1);
       assertEquals(25.12,l1.calcVolume(2,2), 1);
       assertEquals(84.78,l1.calcVolume(3,3), 1);
   } 
}
