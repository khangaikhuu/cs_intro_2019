import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
  @Test
  public void testClasswork()
  {
      ClassworkOne co = new ClassworkOne(2, true, "hi");
      assertEquals ( 2, co.getA (2));
      assertEquals ( true, co.getB ());
      assertEquals ( "hi", co.getC ());
    }
}
