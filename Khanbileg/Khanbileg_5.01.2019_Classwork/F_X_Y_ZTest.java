

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class F_X_Y_ZTest
{
  @Test 
  public void TestF_X_Y_Z() 
  { 
      F_X_Y_Z c4 = new F_X_Y_Z(); 
      assertEquals(false, c4.F_X_Y_Z(false, true, false)); 
      assertEquals(false, c4.F_X_Y_Z(true, false, true)); 
      assertEquals(false, c4.F_X_Y_Z(false, true, false)); 
    } 
}