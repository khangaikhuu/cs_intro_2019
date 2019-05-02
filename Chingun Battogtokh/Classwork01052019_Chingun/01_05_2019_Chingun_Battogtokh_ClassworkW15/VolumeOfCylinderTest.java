

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeOfCylinderTest
{ 
    @Test
    public void TestVolumeOfCylinder() 
    { 
        VolumeOfCylinder c4 = new VolumeOfCylinder(); 
        assertEquals(113.4, c4.VolumeOfCylinder(3,4),1); 
        assertEquals(471.0, c4.VolumeOfCylinder(5,6),1); 
        assertEquals(1230.88, c4.VolumeOfCylinder(7,8),1); 
    }
}
