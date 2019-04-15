

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StarTest
{
   @Test 
   public void testMymethod()
   {
       Star s1 = new Star();
       assertEquals(4, s1.getA());
       assertEquals(5, s1.getB());
       s1.setA(5);
       s1.setB(5);
       assertEquals(5, s1.getA());
       assertEquals(4, s1.getA());
       
    }
}
