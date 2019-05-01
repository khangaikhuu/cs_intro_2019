

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
   @Test 
   public void TestMyLoop()
   { 
       MyLoop c4 = new MyLoop();
       assertEquals(100, c4.punisher(10)); 
    } 
   
}
