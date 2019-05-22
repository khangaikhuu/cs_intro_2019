package Classwork08052019_KhulanEnkhbold;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
   @Test
   public void TestMethod()
   {
       ChangeMyValue c1 = new ChangeMyValue();
       assertEquals (3, c1.getElement (2));
       c1.ChangeValue(2, 5);
       assertEquals (5, c1.getElement (2));
       c1.ChangeValue(2, 8);
       assertEquals (8, c1.getElement (2));
       c1.ChangeValue(9, 2);
       assertEquals (8, c1.getElement (2));
    }
}
