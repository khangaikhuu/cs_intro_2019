

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaOfQuadratTest
{
  @Test 
  public void TestAreaOfQuadrat() 
  { 
      AreaOfQuadrat c4 = new AreaOfQuadrat();
      assertEquals(9, c4.AreaOfQuadrat(3)); 
      assertEquals(25, c4.AreaOfQuadrat(5)); 
      assertEquals(4, c4.AreaOfQuadrat(2));
    }
      
  
}
