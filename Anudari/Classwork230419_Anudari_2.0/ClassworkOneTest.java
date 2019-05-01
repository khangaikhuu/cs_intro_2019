

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
  @Test
  public void testMyMethod()
  {
      ClassworkOne c1 = new ClassworkOne("Anudari", 20);
      assertEquals("Anudari",c1.getA());
      assertEquals(20,c1.getB());
   
}
}
