
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
       assertEquals(2, c.getX());
       assertEquals(3, c.multiplication(2));
    }
}
