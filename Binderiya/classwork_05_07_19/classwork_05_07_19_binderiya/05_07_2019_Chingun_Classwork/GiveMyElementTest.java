

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMyElementTest
{
   @Test 
   public void TestGiveMyElement() 
   { 
       GiveMyElement c4 = new GiveMyElement(); 
       assertEquals(2, c4.returnElement(1)); 
       assertEquals(3, c4.returnElement(2)); 
       assertEquals(4, c4.returnElement(3)); 
    } 
}
