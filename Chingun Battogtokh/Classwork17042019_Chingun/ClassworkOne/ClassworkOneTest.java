

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void testClassworkOne()
    { 
        ClassworkOne c4 = new ClassworkOne(4, true, "bruh"); 
        assertEquals(4, c4.getMoney(4)); 
        assertEquals(true, c4.getBag(true)); 
        assertEquals("bruh",c4.getGuns("bruh")); 
    } 
        
    
    
    
    
    
}
