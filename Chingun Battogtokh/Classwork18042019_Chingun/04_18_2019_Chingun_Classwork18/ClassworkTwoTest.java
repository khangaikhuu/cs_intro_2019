

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
   @Test 
   public void TestClassworkTwo() 
   { 
       ClassworkTwo c4 = new ClassworkTwo(1, 2); 
       assertEquals(3, c4.getExd(1,2)); 
       assertEquals(2, c4.getBruh(1,2)); 
       assertEquals(256, c4.multiply(4)); 
       assertEquals(46656, c4.multiply(6));
       assertEquals(4, c4.multiply(2));
    }
}
