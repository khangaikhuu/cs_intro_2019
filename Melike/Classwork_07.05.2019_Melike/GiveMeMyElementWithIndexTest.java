

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    @Test
  public void testGiveMeMyElementWithIndex()
  {
      GiveMeMyElementWithIndex gmmewi = new GiveMeMyElementWithIndex();
      int [] m1 = {5, 4, 2, 6, 7};
      assertEquals (2, gmmewi.getIndexArray(2, m1));
      int [] m2 = {3, 4};
      assertEquals (4, gmmewi.getIndexArray(1, m2));
      int [] m3 = {0, 1, 2, 3, 4, 5};
      assertEquals (5, gmmewi.getIndexArray(5, m3));
  }
}
