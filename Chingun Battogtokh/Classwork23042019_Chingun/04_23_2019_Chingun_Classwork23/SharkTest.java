

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
    @Test 
    public void testShark()
   { 
       Shark c4 = new Shark();
       assertEquals(false, c4.ripjaw(true)); 
       assertEquals(102, c4.monies(2)); 
    }
}
