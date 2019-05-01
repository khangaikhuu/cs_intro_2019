

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
   @Test
   public void testShark()
   {
       Shark sa = new Shark();
       assertEquals (false, sa.Shark());
       assertEquals (102, sa.getInteger());
       
    }
}
