

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLoopTest
{
  @Test
  public void TestMyMethod()
  {
      MyLoop c1 = new MyLoop();
      assertEquals (10, c1.getLoop(1));
    }
}
