
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LessThan100Test
{
    @Test
    public void testLessThan100()
    {
       LessThan100 q1 = new LessThan100();
       assertEquals(true,q1.check100(12,1));
       assertEquals(false,q1.check100(101,1));
       assertEquals(true,q1.check100(7,3));
    }
}