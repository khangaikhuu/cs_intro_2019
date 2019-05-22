package Classwork08052019_KhulanEnkhbold;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
  @Test
  public void TestMethod()
  {
      CreateArray c1 = new CreateArray();
      c1.CreateArray (2, 5);
      assertEquals (5, c1.getElement (2));
      c1.CreateArray (2, 8);
      assertEquals (8, c1.getElement (2));
      c1.CreateArray (2, 9);
      assertEquals (9, c1.getElement (2));
    }
}
