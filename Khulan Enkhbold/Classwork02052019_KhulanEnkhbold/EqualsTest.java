

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualsTest
{
   @Test 
   public void TestEquals()
   {
       Equals c4 = new Equals();
       assertEquals(false, c4.Equals(1, 2));
       assertEquals(false, c4.Equals(1, 2));
       assertEquals(false, c4.Equals(3, 4));
    }


}
