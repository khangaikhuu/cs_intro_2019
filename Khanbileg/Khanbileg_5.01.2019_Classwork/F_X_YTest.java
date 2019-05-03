

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class F_X_YTest
{
    @Test 
   public void TestF_X_Y() 
   { 
       F_X_Y c4 = new F_X_Y(); 
       assertEquals(25, c4.F_X_Y(3,4)); 
       assertEquals(20, c4.F_X_Y(4,2)); 
       assertEquals(73, c4.F_X_Y(3,8)); 
    }
}
