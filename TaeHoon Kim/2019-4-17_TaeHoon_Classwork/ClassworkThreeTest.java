
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkThreeTest
{
    @Test
    public void testForThree()
    {
        ClassworkThree c3 = new ClassworkThree();
        assertEquals(2, c3.getA());
        assertEquals(3, c3.getLoop(2));
    }
}
