import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testForOne()
    {
        ClassworkOne c1 = new ClassworkOne(2);
        assertEquals(2, c1.getX());
        assertEquals(2, c1.getLoop(2));
        assertEquals(9, c1.getLoop(3));
    }
}
