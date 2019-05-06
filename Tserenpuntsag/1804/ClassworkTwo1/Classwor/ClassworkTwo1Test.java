package Classwor;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwo1Test
{
   @Test 
   public void testClassworkTwo()
   {
       ClassworkTwo1 c2 = new ClassworkTwo1(12f,1.5);
       assertEquals(12f, c2.getA(),12f);
       assertEquals(1.5, c2.getB(), 1.5);
    }
}

