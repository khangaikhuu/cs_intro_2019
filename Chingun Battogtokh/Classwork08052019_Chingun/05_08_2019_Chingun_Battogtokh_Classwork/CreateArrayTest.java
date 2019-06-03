

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
  @Test
  public void TestCreateArray()
  { 
      CreateArray c4 = new CreateArray(); 
      c4.CreateArray(1, 2);
      assertEquals(0, c4.getElement(2)); 
      c4.CreateArray(3,4);
      assertEquals(0, c4.getElement(4));
      c4.CreateArray(6,7);
      assertEquals(0, c4.getElement(5)); 
    } 
}
