

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    @Test
  public void testMyMethod()
  {
      GiveMeMyElementWithIndex s1 = new GiveMeMyElementWithIndex();
      int[] myArray = {1,2,4,6,7,8};
      assertEquals(7,s1.getElement(myArray,4));
     
      int[] myArray1 = {1,2,6,7,9};
      assertEquals(7,s1.getElement(myArray,4));
      int[] myArray2 = {1,5,3,7,9};
      assertEquals(1,s1.getElement(myArray,0));
   
    
      
      
      
    }
}

