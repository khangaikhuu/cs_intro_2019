

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagoreanTest
{
   @Test 
   public void testPythagorean()
   {
       Pythagorean c4 = new Pythagorean();
       assertEquals(1.41, c4.Pythagorean(1,1),1);
       assertEquals(2.84, c4.Pythagorean(2,2),1);
       assertEquals(4.24, c4.Pythagorean(3,3),1);
    }
}
