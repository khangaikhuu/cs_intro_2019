

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
   @Test 
   public void tesytArray()
   {
       GiveMeMyElement ma = new GiveMeMyElement ();
       assertEquals (3, ma.returnElement(2));
       assertEquals (4, ma.returnElement(3));
       assertEquals (19, ma.returnElement(4));
    }
}
