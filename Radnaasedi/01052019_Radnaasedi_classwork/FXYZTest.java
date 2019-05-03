

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FXYZTest
{
    @Test 
  public void TestFxyz() 
  { 
      FXYZ c4 = new FXYZ(); 
      assertEquals(false, c4.FXYZ(false, true, false)); 
      assertEquals(false, c4.FXYZ(true, false, true)); 
      assertEquals(false, c4.FXYZ(false, true, false)); 
    } 
}
