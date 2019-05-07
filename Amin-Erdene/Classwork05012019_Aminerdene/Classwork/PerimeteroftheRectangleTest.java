

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class PerimeteroftheRectangleTest
{
    @Test
    public void testPerimeteroftheRectangle()
    {
        PerimeteroftheRectangle c4 = new PerimeteroftheRectangle();
        assertEquals(18, c4.PerimeteroftheRectangle(7,2));
        assertEquals(24, c4.PerimeteroftheRectangle(4,8));
        assertEquals(16, c4.PerimeteroftheRectangle(2,6));
    }
    
}
