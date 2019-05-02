

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateF2Test
{
    @Test
    public void TestMyMethod()
    {
        CalculateF2 c2 = new CalculateF2();
        assertEquals(false, c2.getF2(true,false,true));
        assertEquals(true, c2.getF2(true,true,true));
        assertEquals(true, c2.getF2(false,false,false));
    }
}
