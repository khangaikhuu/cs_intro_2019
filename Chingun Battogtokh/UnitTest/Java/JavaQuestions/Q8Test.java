

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q8Test
{ 
    @Test
    public void TestQ8() 
    { 
        Q8 c4 = new Q8(); 
        assertEquals(-3, c4.calcNum(2, 3)); 
        assertEquals(9, c4.calcNum(5, 4)); 
        assertEquals(44, c4.calcNum(6, 8)); 
    } 
  
    
}
