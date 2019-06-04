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
       assertEquals(2, c4.Fxy(1,1)); 
       assertEquals(8, c4.Fxy(2,2)); 
       assertEquals(18, c4.Fxy(3,3)); 
    } 
}
