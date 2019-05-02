

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeofCylinderTest
{
    @Test
    public void testThisMethod()
    {
        VolumeofCylinder c1 = new VolumeofCylinder();
        assertEquals(3.1415926, c1.calcVolumeCylinder(1.0, 1.0), 0.1);
        assertEquals(84.8230002, c1.calcVolumeCylinder(3.0, 3.0), 0.1);
        assertEquals(471.23889, c1.calcVolumeCylinder(5.0, 6.0), 0.1);
    }
}
