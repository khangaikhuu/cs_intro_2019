
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
    @Test
    public void testForOne()
    {
        ClassworkOne c8 = new ClassworkOne(8, true, "Myanganbayar");
        assertEquals(8, c8.getA());
        assertEquals(true, c8.getB());
        assertEquals("Myanganbayar", c8.getC());
    }
}
