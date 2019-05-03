

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeCylinderTest
{
    @Test
    public void testAreaCircle()
    {
        VolumeCylinder v1 = new VolumeCylinder();
        assertEquals(62.83, v1.Volume(2, 5), 1);
        assertEquals(9.42, v1.Volume(1, 3), 1);
        assertEquals(628, v1.Volume(5, 8), 1);
    }
}
