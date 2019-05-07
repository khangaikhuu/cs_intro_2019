

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
      GiveMeMyElementWithIndex gmmewi = new GiveMeMyElementWithIndex();
      int [] m1 = {5, 4, 2, 6, 7};
      assertEquals (2, gmmewi.getIndexSize(2, m1));
      int [] m2 = {3, 4};
      assertEquals (4, gmmewi.getIndexSize(1, m2));
      int [] m3 = {0, 1, 2, 3, 4, 5};
      assertEquals (5, gmmewi.getIndexSize(5, m3));
    }
}
