

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SharkTest
{
  @Test 
  public void  testSharkTest()
  {
      Shark sa = new Shark ();
      assertEquals (false, sa.getShark());
      assertEquals (102, sa.getInteger());
    }
}
