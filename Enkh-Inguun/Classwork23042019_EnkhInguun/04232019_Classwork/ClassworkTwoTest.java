

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void TestTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo (3, "hey", 4.5);
        assertEquals (3,c2.getA ());
        assertEquals ("hey", c2.getB ());
        assertEquals (4.5, c2.getC (),1);
        c2.setA(4);
        assertEquals (4, c2.getA ());
        c2.setB("kk");
        assertEquals ("kk", c2.getB ());
        c2.setC(5.5);
        assertEquals (5.5, c2.getC (),1);
        assertEquals (46, c2.loop(1));
    }
}
