

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeofCylinderTest
{
    @Test 
    public void testVolume()
    {
        VolumeofCylinder v1 = new VolumeofCylinder();
        assertEquals(1130.97 ,v1.getVolume(6,10),1);
        assertEquals(9.42, v1.getVolume(1,3),1);
        assertEquals(452.39, v1.getVolume(4,9),1);
        
}
}
