

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
    @Test
  public void testGiveMeMyElement()
  {
      GiveMeMyElement gmme = new GiveMeMyElement();
      assertEquals (25, gmme.getMyArray(5));
      assertEquals (45, gmme.getMyArray(7));
      assertEquals (12, gmme.getMyArray(8));
    }
}
