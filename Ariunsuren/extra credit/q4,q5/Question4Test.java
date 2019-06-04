

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Question4Test
{
   @Test
   public void testQ4()
   {
       Question4 ma = new Question4();
       assertEquals(5, ma.getSizeOfMyArray1(),1);
       assertEquals(5, ma.getSizeOfMyArray2(),1);
       assertEquals(2, ma.getElement2(),1);
    }
}
