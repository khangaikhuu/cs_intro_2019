

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
   @Test
   public void testMethod()
   {
       ClassworkTwo co = new ClassworkTwo(1,2);
       assertEquals (3, co.getSum());
       assertEquals (2, co.getMultiplication()) ;
       assertEquals (5, co.getLoop(2)) ;
       assertEquals (11, co.getLoop(3)) ;
       assertEquals (19, co.getLoop(4)) ;
    }
}
