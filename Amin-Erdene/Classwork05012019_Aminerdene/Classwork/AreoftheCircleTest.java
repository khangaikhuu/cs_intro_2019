

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AreoftheCircleTest
{
    @Test 
    public void testAreaoftheCircle()
    {
        AreoftheCircle c4 = new AreoftheCircle();
        assertEquals(72.2, c4.AreaoftheCircle(23), 1);
        assertEquals(37.68, c4.AreaoftheCircle(12), 1);
        assertEquals(100.48, c4.AreaoftheCircle(32), 1);
    }
}
