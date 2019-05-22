

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GiveMeMySizeTest
{
   @Test
   public void testMySize()
   {
       GiveMeMySize ma = new GiveMeMySize();
       assertEquals(11, ma.getSizeOfMyArray());
       int [] myArray = {1, 2, 3};
       assertEquals(11, ma.getSizeOfMyArray());
       int [] myArray2 = {1, 2, 3, 4, 5};
       assertEquals(11, ma.getSizeOfMyArray());
       int [] myArray3 = {1, 2, 3, 4, 5, 6};
   }
}
