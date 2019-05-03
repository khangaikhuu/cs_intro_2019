


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualsTest
{
   @Test 
   public void TestEquals() 
   { 
       Equals c4 = new Equals(); 
       assertEquals(false, c4.Equals(21, 64)); 
       assertEquals(true, c4.Equals(50, 50)); 
       assertEquals(false, c4.Equals(21, 54));
    } 
}