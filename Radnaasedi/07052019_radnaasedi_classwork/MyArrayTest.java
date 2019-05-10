

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{
   @Test
   public void testMyArray()
   {
       MyArray ma = new MyArray();
       assertEquals(5, ma.getSizeOfMyArray1());
       assertEquals(5, ma.getSizeOfMyArray2());
       assertEquals(0, ma.getElement());
       assertEquals(0, ma.getElement(), 1);
   }
}
