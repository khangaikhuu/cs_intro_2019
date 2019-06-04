

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThan100Test
{
    @Test 
    public void TestLessThan100()
    { 
        LessThan100 c4 = new LessThan100(); 
        assertEquals(true, c4.LessThan100(30, 40)); 
        assertEquals(true, c4.LessThan100(50, 60)); 
        assertEquals(false, c4.LessThan100(110, 120)); 
    } 
    
}
