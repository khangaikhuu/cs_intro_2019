

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
   @Test
   public void testMyMythod()
   {
       Shark c1 = new Shark();
       assertEquals(false, c1.cat());
       assertEquals(10, c1.dog(10));
   }
}
