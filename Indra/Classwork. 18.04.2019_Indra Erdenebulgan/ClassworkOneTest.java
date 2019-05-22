import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void testOne()
    {
        ClassworkOne c1 = new ClassworkOne(1);
        assertEquals(1, c1.getA());
        assertEquals(1, c1.getLoop(1));
        assertEquals(4, c1.getLoop(2));
    }
}
