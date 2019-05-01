import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class SharkTest
{
    @Test
    public void testSharkTest()
    {
    Shark s = new Shark();
    assertEquals(false, s.getX());
    assertEquals(102, s.getY());
   }
}
