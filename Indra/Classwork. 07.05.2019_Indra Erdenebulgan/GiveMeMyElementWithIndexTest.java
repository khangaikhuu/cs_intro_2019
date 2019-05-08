import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
   @Test
   public void testMyArray()
   {
       GiveMeMyElementWithIndex e = new GiveMeMyElementWithIndex();
       int[] myArray = {1, 2, 3, 4, 5};
       assertEquals(1, e.GetGiveMeMyElementWithIndex(0, myArray));
       assertEquals(4, e.GetGiveMeMyElementWithIndex(3, myArray));
       assertEquals(5, e.GetGiveMeMyElementWithIndex(4, myArray));
   }   
}
