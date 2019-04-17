import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ClassworkOneTest
{
    @Test
    public void testForOne()
    {
        ClassworkOne c1 = new ClassworkOne(1 ,true, "Amin-Erdene");
        assertEquals(1, c1.getA ());
        assertEquals(true, c1.getB());
        assertEquals("Amin-Erdene", c1.getC());
    }
}
