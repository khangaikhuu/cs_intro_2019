import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculateNotTest
{
    @Test 
    public void testNot()
    {
        calculateNot l1 = new calculateNot();
        assertEquals(false, l1.Not(true, true, false));
        assertEquals(false, l1.Not(true, false, true));
        assertEquals(false, l1.Not(false, true, false));
    }
}
