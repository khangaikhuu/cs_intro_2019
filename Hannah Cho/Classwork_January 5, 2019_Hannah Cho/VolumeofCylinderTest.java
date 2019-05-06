

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeofCylinderTest
{
    @Test
    public void TestMyMethod()
    {
        VolumeofCylinder v1 = new VolumeofCylinder();
        assertEquals(50.24, v1.getVolume(2,4), 1);
        assertEquals(923.16, v1.getVolume(7,6), 1);
        assertEquals(226.079, v1.getVolume(3,8), 1);
    }
    
}
