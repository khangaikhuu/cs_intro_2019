

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q9Test
{
  @Test 
  public void TestQ9() 
  { 
      Q9 c4 = new Q9(); 
      assertEquals(true, c4.bool(true, true)); 
      assertEquals(true, c4.bool(false, false)); 
      assertEquals(false, c4.bool(true, false)); 
    } 
}
