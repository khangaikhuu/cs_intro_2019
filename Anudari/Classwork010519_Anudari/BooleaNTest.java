

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BooleaNTest
{
    @Test 
    public void testMyBoolean()
    { 
        BooleaN b1 = new BooleaN();
        assertEquals(true,b1.getEquation(true,true,true));
       assertEquals(false,b1.getEquation(true,false,true));
       assertEquals(true,b1.getEquation(false,false,true));
    }
    
}
