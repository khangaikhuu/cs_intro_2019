import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testForOne()
    {
        ClassworkOne c1 = new ClassworkOne(2, true, "SungMin");
        assertEquals(2, c1.getA());
        assertEquals(true, c1.getB());
        assertEquals("SungMin", c1.getC());
    }
}
