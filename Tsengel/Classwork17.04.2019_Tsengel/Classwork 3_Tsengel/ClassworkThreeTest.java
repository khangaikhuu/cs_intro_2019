
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkThreeTest
{
   @Test
   public void testThree()
   {
       ClassworkThree c = new ClassworkThree();
       assertEquals(1, c.getX(1));
       assertEquals(2, c.multiplication(2));
    }
}
