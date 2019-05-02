

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumofFirst100NumbersTest
{ 
    @Test 
    public void testMySum()
    {
        SumofFirst100Numbers s1 = new SumofFirst100Numbers();
        assertEquals(5051,s1.loopnumber(1));
    }
       
}
