import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class VolumeofCylinderTest
{
    @Test 
    public void testAreaCircle()
    {
        VolumeofCylinder v1 = new VolumeofCylinder();
        assertEquals(62.83, v1.Volume(2, 5), 1);
        assertEquals(452.16, v1.Volume(6, 4), 1);
        assertEquals(1130.97, v1.Volume(6, 10), 1); 
    }
}
