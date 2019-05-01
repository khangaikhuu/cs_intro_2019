

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class addNumbersTest
{
    @Test
    public void testThisMethod()
    {
        addNumbers obj1 = new addNumbers();
        assertEquals(3, obj1.add_Num(1, 1, 1), 0.01);
        assertEquals(6, obj1.add_Num(2, 2, 2), 0.01);
        assertEquals(9, obj1.add_Num(3, 3, 3), 0.01);
    }
}
