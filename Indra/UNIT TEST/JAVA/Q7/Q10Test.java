import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q10Test
{
  @Test
  public void testQ10()
  {
      Q10 ma = new Q10(); 
      assertEquals(5, ma.getSizeOfmyArray1());
      assertEquals(5, ma.getSizeOfmyDoubleArray());
      assertEquals(0, ma.getElement());
      assertEquals(2.5, ma.getElement2(), 1);

  }
}
