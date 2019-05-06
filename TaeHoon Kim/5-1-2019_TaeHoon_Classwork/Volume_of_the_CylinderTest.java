

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Volume_of_the_CylinderTest
{
    @Test
    public void testVolume_of_the_CylinderTest()
    {
        Volume_of_the_Cylinder v1 = new Volume_of_the_Cylinder();
        assertEquals(62.83, v1.Volume(2, 5), 1);
        assertEquals(452.16, v1.Volume(6, 4), 1);
        assertEquals(1130.97, v1.Volume(6, 10), 1);
    }
}
