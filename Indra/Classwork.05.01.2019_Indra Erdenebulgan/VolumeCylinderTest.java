import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VolumeCylinderTest
{
  @Test
  public void TestVolume()
  {
      VolumeCylinder v1 = new VolumeCylinder();
      assertEquals(3.14, v1.VolumeCylinder(1,1));
      assertEquals(25.13, v1.VolumeCylinder(2,2));
      assertEquals(84.82, v1.VolumeCylinder(3,3));
      
  }
}
