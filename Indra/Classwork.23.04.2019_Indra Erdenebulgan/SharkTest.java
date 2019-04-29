

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SharkTest
{
 @Test
 public void tesMyMethod()
  {
      Shark s1 = new Shark();
      assertEquals(false, s1.getisTrue());
      assertEquals(102, s1.getmyInteger());
 
  } 
}
