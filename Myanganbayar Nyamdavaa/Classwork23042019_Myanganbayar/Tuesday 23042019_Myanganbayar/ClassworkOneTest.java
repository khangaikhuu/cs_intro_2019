

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
   @Test
   public void testThisMethod()
   {
        ClassworkOne co = new ClassworkOne(1, "Myangaa");
        
        assertEquals("Myangaa", co.getB());
        co.setD("bye");
        assertEquals("bye", co.getB());
        co.setD("me");
        assertEquals("me", co.getB());
   }
}