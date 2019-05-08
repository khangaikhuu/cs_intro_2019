

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
   @Test
   public void testCreateArray()
   {
       CreateArray ca = new CreateArray();
       ca.setNewArray(3, 5);
       assertEquals(0, ca.getNewArray(3));
       ca.setNewArray(3, 5);
       assertEquals(3, ca.getNewArray(5));
       ca.setNewArray(3, 5);
       assertEquals(0, ca.getNewArray(6));
    }
}
