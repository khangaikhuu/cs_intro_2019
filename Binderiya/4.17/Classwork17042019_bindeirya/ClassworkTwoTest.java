import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
   @Test
    public void testforTwo()
    {
    ClassworkTwo c2 = new ClassworkTwo(2.0f, 4.0);
    assertEquals(2.0f, c2.getA(), 1);
    assertEquals(4.0, c2.getB(), 1);
    c2.setA(4.0f);
    c2.setB(5.0);
    assertEquals(4.0f, c2.getA(), 1);
    assertEquals(5.0, c2.getB(), 1);
    }
}
