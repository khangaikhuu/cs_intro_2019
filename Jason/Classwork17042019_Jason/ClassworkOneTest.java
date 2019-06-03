import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ClassworkOneTest
{
    @Test
    public void testClassOne()
    {
        ClassworkOne c1 = new ClassworkOne (1,true, "Jason");
        assertEquals(1, c1.getA());
        assertEquals(true, c1.getB());
        assertEquals("Jason" , c1.getC());
    }
}
