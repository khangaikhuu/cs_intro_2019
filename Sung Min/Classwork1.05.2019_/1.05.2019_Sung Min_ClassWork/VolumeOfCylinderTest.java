

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeOfCylinderTest
{
    @Test
    public void testAreaCircle()
    {
        VolumeOfCylinder v1 = new VolumeOfCylinder();
        assertEquals(62.83, v1.Volume(2, 5), 1);
        assertEquals(9.42, v1.Volume(1, 3), 1);
        assertEquals(1130.97, v1.Volume(6, 10), 1);
    }
}
