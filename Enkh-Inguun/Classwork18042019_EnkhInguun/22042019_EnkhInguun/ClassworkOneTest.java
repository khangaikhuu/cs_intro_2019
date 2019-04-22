

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test
   public void tesMyMethod()
   {
       ClassworkOne co = new ClassworkOne(2) ;
       assertEquals (1, co.getA());
       assertEquals (2, co.getLoop(2));
       assertEquals (3, co.getLoop(3));
       assertEquals (4, co.getLoop(4));
    }
}
