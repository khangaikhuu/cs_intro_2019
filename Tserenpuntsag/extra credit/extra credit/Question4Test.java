

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
       assertEquals(5, ma.getSizeOfMyArray1());
       assertEquals(5, ma.getSizeOfMyArray2());
       assertEquals(0, ma.getElement());
    }
    
       
}
