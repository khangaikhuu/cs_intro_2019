

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LawofGravityTest
{
   @Test
   public void testMyGravity()
   {
       LawofGravity g1 = new LawofGravity();
       assertEquals(4,g1.getGravity(2,2,5,4));
       assertEquals(20,g1.getGravity(5,8,2,4));
       assertEquals(84,g1.getGravity(4,7,6,2));
    }
  
}
