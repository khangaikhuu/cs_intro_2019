
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
   @Test
   public void testClassworkOne()
   {
       ClassworkOne c = new ClassworkOne(1, "Tsengel");
       assertEquals("Tsengel", c.getB());
       c.setD("Hey");
       assertEquals("Hey", c.getB());
       c.setD("Bye");
       assertEquals("Hey", c.getB());
    }
}
