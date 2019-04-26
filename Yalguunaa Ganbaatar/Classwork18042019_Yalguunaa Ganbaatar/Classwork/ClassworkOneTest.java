import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
   @Test
   public void testClassworkOne()
   {
       ClassworkOne j1 =  new ClassworkOne(2);
       assertEquals(2,j1.getDodo(2));
       assertEquals(4,j1.getMultiply(1));
       assertEquals(256,j1.getMultiply(2));
       assertEquals(0,j1.getMultiply(3));
    }
}
