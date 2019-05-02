import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkTwo c2 = new ClassworkTwo(1, "Binderiya", 5.0);
        assertEquals(1, c2.getA());
        assertEquals(5, c2.getmyMethod(),1);
        assertEquals("Binderiya",c2.getmyName());
        c2.setA(2);
        c2.setmyName("Binderiya");
        c2.setmyMethod(5.0);
    }
}
