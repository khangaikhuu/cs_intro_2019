

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LawoftheGravityTest
{
   @Test
    public void LawoftheGravity() 
    { 
        LawoftheGravity c4 = new LawoftheGravity(); 
        assertEquals(122.45179999999999, c4.CalcGrav(23,3,5), 1); 
        assertEquals(10064.6109, c4.CalcGrav(65,21,3), 1); 
        assertEquals(20674.029, c4.CalcGrav(23,54,2), 1); 
    }
}

