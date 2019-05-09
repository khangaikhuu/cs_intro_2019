

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValeTest
{
 @Test 
 public void testMyMethod()
 {
     ChangeMyVale cmv = new ChangeMyVale();
     cmv.changeVale(0,10);
     assertEquals(10, cmv.getElement(0));
     cmv.changeVale(1,8);
     assertEquals(8, cmv.getElement(1));
     cmv.changeVale(3,9);
     assertEquals(9, cmv.getElement(3));
    }
     
    
}
