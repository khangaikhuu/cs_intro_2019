

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
   @Test
  public void testGiveMeMySize()
  {
      GiveMeMySize gmms = new GiveMeMySize();
      assertEquals (11, gmms.getSize());
      assertEquals (11, gmms.getSize());
      assertEquals (11, gmms.getSize());
      int [] m1 = {5, 4, 2, 6, 7};
      assertEquals (5, gmms.getIndexSize(2, m1));
      int [] m2 = {3, 4};
      assertEquals (2, gmms.getIndexSize(1, m2));
      int [] m3 = {0, 1, 2, 3, 4, 5};
      assertEquals (6, gmms.getIndexSize(5, m3));
    }
}
