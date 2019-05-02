
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VolumeCylinderTest
{
   @Test
   public void VolumeCylinderTest()
   {
       VolumeCylinder v1 = new VolumeCylinder();
       assertEquals(615.44, v1.volumeCylinder(4, 7), 1);
       assertEquals(62.8000000000000004, v1.volumeCylinder(5, 2),1);
       assertEquals(1808.64, v1.volumeCylinder(9, 8),1);
    }
}
