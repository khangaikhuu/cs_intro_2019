import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfQuadratTest
{
    @Test
    public void testAreaQuadrat()
    {
        AreaOfQuadrat aq = new AreaOfQuadrat();
        assertEquals(4.83, aq.Area(2.1), 1);
        assertEquals(1.44, aq.Area(1.2), 1);
        assertEquals(16.0, aq.Area(4.0), 1);
    }
}
