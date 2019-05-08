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
       assertEquals(11, ma.getSizeOfmyArray1());
       int [] myArray = {1, 2, 3};
       assertEquals(3, ma.getSizeOfmyArray2(myArray));
       int [] myArray2 = {1, 2, 3, 4, 5};
       assertEquals(5, ma.getSizeOfmyArray2(myArray2));
       int [] myArray3 = {1, 2, 3, 4, 5, 6, 7};
       assertEquals(7, ma.getSizeOfmyArray2(myArray3));
    }
}
