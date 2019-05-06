import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class EqualNumTest
{
    @Test
    public void testEqualNum()
    {
        EqualNum l1 = new EqualNum();
        assertEquals(true, l1.equal(1,1));
        assertEquals(true, l1.equal(3,3));
        assertEquals(false, l1.equal(1,2));
    }
}
