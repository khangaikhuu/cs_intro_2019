

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaoftheQuadratTest
{
    @Test
    public void testMyMethod()
    {
        AreaoftheQuadrat a1 = new AreaoftheQuadrat();
        assertEquals(16, a1.getQuadrat(4), 1);
    }
}
