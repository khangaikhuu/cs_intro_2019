

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testClassworkOne()
    {
      ClassworkOne co = new ClassworkOne(5 ,true, "hi");
      assertEquals ( 5, co.getA ());
      assertEquals ( true, co.getB ());
      assertEquals ( "hi", co.getC ());
      
    }
    
    
}
