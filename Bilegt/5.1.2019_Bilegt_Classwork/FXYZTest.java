

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FXYZTest
{
    @Test 
  public void TestFXYZ() 
  { 
      FXYZ c4 = new FXYZ(); 
      assertEquals(false, c4.Fxyz(true, false, true)); 
      assertEquals(false, c4.Fxyz(false, true, false)); 
      assertEquals(false, c4.Fxyz(false, true, false)); 
    } 
}
