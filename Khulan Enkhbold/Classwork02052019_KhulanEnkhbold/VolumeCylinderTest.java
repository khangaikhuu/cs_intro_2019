

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeCylinderTest
{
  @Test 
  public void testThisMethod()
  {
      VolumeCylinder c1 = new VolumeCylinder();
      assertEquals(3.14, c1.calcVolumeCylinder(1.0, 1.0), 0.1);
      assertEquals(84.82, c1.calcVolumeCylinder(3.0, 3.0), 0.1);
      assertEquals(471.23, c1.calcVolumeCylinder(5.0, 6.0), 0.1);
    }
}
