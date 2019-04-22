

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
   @Test
   public void testClassworkTwo()
    {
        ClassworkTwo c1 = new ClassworkTwo(1.4f, 2.5);
        assertEquals(1.4f, c1.getHelp(1.4f), 1);
        assertEquals(2.5, c1.getOut(2.5), 1);
    }
}
