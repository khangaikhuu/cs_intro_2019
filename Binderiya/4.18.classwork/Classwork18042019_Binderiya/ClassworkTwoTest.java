import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testforTwo()
    {
        ClassworkTwo c1 = new ClassworkTwo(1,2);
        assertEquals(20, c1.loopNumbers(10));
        assertEquals(3,c1.getSum());
        assertEquals(2, c1.getProduct());
    }
}


