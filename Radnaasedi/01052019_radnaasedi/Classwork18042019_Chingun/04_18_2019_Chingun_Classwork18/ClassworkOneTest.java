

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test 
   public void TestClassworkOne() 
   { 
       ClassworkOne c4 = new ClassworkOne(1);
       assertEquals(1, c4.getCide(1)); 
       assertEquals(1, c4.multiply(16));
       assertEquals(1, c4.multiply(2)); 
       assertEquals(1, c4.multiply(5)); 
    } 
}
