

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo c1 = new ClassworkTwo(1.2f, 2.3);
        assertEquals(1.2f, c1.getHelp(1.2f), 1);
        assertEquals(2.4, c1.getOut(2.4), 1);
    }
}
