
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculateFxTest
{
   @Test
   public void testCalculatefx()
   {
       calculateFx f1 = new calculateFx();
        assertEquals(29, f1.Fx(2, 5));
        assertEquals(10, f1.Fx(1, 3));
        assertEquals(136, f1.Fx(6, 10));
    }
}
