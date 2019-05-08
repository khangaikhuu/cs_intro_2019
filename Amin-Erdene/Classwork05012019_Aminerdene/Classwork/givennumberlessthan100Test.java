

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class givennumberlessthan100Test
{
  @Test
  public void testgivennumberlessthan100()
  {
   givennumberlessthan100 q1 = new givennumberlessthan100()   
   asssertEquals(true, q1.check100(12,1));
   asssertEquals(false, q1.check100(101,1));
   asssertEquals(true, q1.check100(7,3));
  }
  
}
