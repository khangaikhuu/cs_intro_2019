

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
  @Test
  public void testMyMethod()
  {
      GiveMeMySize s1 = new GiveMeMySize();
      assertEquals(11,s1.getSize());
      int []array = {1,2,4,6,7,8};
      assertEquals(6,s1.getLength(array));
      
    }
}
