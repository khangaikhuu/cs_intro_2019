

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyClassTest
{
   @Test
   public void myClassTest()
   {      
       MyClass myClass = new MyClass();
       assertEquals(1, myClass.myMethod());
   }
}
