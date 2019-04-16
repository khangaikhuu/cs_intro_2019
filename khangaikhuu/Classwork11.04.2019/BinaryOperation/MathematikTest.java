import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathematikTest
{
   
   @Test
   public void testVoid()
   {
       Mathematik m = new Mathematik();
       assertEquals(4, m.calculateAddition(1, 3));
   }
}
