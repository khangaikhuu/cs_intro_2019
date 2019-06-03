

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
  @Test
  public void testmyArray()
  {
      GiveMeMyElement ma = new GiveMeMyElement();
      assertEquals (6, ma. getSizeOfmyArray1());
      assertEquals (6, ma. getSizeOfmyDoubleArray());
      assertEquals (3, ma. getElement(), 1);
      assertEquals (5.5, ma. getElement(), 0.1);
    }
    
      
      
      
}
