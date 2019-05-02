import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void ClassworkOne()
    {
        ClassworkOne c1 = new ClassworkOne(1,"Binderiya");
        assertEquals(1, c1.getA());
        assertEquals("Binderiya", c1.getmyName());
    }
}
