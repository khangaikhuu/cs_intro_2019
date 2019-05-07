package classwork;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeCylinderTest
{
     @Test
    public void TestVolumeOfCylinder() 
    { 
        VolumeCylinder c4 = new VolumeCylinder(); 
        assertEquals(3.14, c4.VolumeOfCylinder(1,1),1); 
        assertEquals(25.13, c4.VolumeOfCylinder(2,2),1); 
        assertEquals(84.82, c4.VolumeOfCylinder(3,3),1); 
    }
}
