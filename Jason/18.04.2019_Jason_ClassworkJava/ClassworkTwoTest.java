import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ClassworkTwoTest
{
    @Test
    public void testTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo(2, 4);
        assertEquals(6, c2.getSum());
        assertEquals(8, c2.getProduct());
        assertEquals(4, c2.getLoop(2));
        assertEquals(46656, c2.getLoop(6));
        assertEquals(27, c2.getLoop(3));
    }
}
