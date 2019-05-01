

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
   @Test
   public void testMyMethod()
   {
       ClassworkTwo c1 = new ClassworkTwo();
       assertEquals(1, c1.getA());
       assertEquals(10.0,5.0,c1.getB());
       assertEquals("Anudari", c1.getC());
       c1.setC("Hello");
       c1.setA(2);
       c1.setB(5.0);
       assertEquals("Hello", c1.getC());
      
   
       
       
       
       
      
       
  
}
}
