

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
   @Test
   public void testClassworkOne()
   {ClassworkOne l1 = new ClassworkOne(1,"ramen");
    assertEquals(1,l1.getPurple(1));
    assertEquals("ramen",l1.getOscar("ramen"));
    assertEquals(2,l1.getPurple(2));
    assertEquals("fight",l1.getOscar("fight"));
    assertEquals(3,l1.getPurple(3));
    assertEquals("help",l1.getOscar("help"));
}
}
