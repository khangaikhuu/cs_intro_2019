

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FxyzTest
{
   @Test 
  public void TestFxyz() 
  { 
      Fxyz c4 = new Fxyz(); 
      assertEquals(false, c4.Fxyz(true, false, true)); 
      assertEquals(false, c4.Fxyz(false, true, false)); 
      assertEquals(false, c4.Fxyz(false, true, false)); 
    }  
}
