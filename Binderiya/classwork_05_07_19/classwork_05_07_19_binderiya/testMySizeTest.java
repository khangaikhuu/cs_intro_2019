import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class testMySizeTest
{
   @Test
   public void testMyArray()
   {
       GiveMeMySize s = new GiveMeMySize();
       assertEquals(11, s.GetGiveMeMySize(3));
       assertEquals(11, s.GetGiveMeMySize(4));
       assertEquals(11, s.GetGiveMeMySize(5));
   }
}
