import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Q8Test
{
    @Test
    public void Q8()
    {
        Q8 q1 = new Q8();
        assertEquals(15, q1.Q8(2,3));
        assertEquals(9, q1.Q8(1,2));
        assertEquals(57, q1.Q8(5,6));
    }
}
