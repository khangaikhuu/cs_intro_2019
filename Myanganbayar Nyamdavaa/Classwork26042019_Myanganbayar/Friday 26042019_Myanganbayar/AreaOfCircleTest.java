

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfCircleTest
{
    @Test
    public void testArea()
    {
        AreaOfCircle ai = new AreaOfCircle();
        assertEquals(12.56, ai.calculateArea(2), 1);
    }
}
