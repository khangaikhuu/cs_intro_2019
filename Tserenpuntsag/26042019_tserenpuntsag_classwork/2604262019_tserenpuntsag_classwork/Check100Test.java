import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Check100Test
{
    @Test
    public void testCheck100()
    {
        Check100 a2 = new Check100();
        assertEquals(true, a2.check100(49));
        assertEquals(false, a2.check100(515));
        assertEquals(false, a2.check100(100));
    }
}
