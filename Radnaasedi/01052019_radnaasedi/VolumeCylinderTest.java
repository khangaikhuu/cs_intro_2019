

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
       assertEquals(351.68, v1.VolumeCylinder(4, 7),1);
       assertEquals(157.0, v1.VolumeCylinder(5, 2),1);
       assertEquals(2034.72, v1.VolumeCylinder(9, 8),1);
    }
       
}
