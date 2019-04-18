import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testForOne()
    {
        ClassworkOne c1 = new ClassworkOne(1,true,"Binderiya");
        assertEquals(1, c1.getA());
        assertEquals(true, c1.getB());
        assertEquals("Binderiya", c1.getC());
    }
    
}
