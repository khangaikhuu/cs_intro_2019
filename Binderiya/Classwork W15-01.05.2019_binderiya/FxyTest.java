

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FxyTest
{
   @Test 
   public void TestFxy() 
   { 
       Fxy c4 = new Fxy(); 
       assertEquals(25, c4.Fxy(3,4)); 
       assertEquals(20, c4.Fxy(4,2)); 
       assertEquals(73, c4.Fxy(3,8)); 
    } 
}
