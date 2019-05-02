

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    @Test 
    public void TestPytha() 
    { 
        PythagorianTheorem p4 = new PythagorianTheorem(); 
        assertEquals(6.708203932499369, p4.Pythagorian(3,6),1); 
        assertEquals(7.280109889280518, p4.Pythagorian(2,7),1); 
        assertEquals(8.06225774829855, p4.Pythagorian(1,8),1); 
    }
}
