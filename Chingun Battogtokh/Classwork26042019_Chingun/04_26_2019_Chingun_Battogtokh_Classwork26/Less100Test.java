

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Less100Test
{
  @Test 
  public void TestLess100() 
  { 
      Less100 c4 = new Less100(); 
      assertEquals(true,c4.Less100(28)); 
      assertEquals(true,c4.Less100(12)); 
      assertEquals(true,c4.Less100(13)); 
    }
  
}
