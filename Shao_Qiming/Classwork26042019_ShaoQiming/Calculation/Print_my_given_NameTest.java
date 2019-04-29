

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Print_my_given_NameTest
{
    @Test
    public void testThisMethod()
    {
        addNumbers obj1 = new addNumbers();
        assertEquals(3, obj1.add_Num(1, 1, 1), 0.01);
        assertEquals(4, obj1.add_Num(1.5, 1.5, 1), 0.01);
        assertEquals(9.4, obj1.add_Num(3.2, 3.2, 3), 0.01);
    }
}
