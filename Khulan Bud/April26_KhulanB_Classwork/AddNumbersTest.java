

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddNumbersTest
{
   @Test 
    public void testAddNumbers() 
    { 
       AddNumbers c4 = new AddNumbers(); 
       assertEquals(10, c4.AddNumbers(2, 3, 5)); 
       assertEquals(14, c4.AddNumbers(6, 7, 1)); 
       assertEquals(30, c4.AddNumbers(10,12, 8)); 
    } 
}
