

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeSizeTest
{
  @Test 
  public void TestGiveMeSize() 
  { 
      GiveMeSize c4 = new GiveMeSize(); 
      assertEquals(11, c4.GiveMeSize()); 
      assertEquals(11, c4.GiveMeSize()); 
      assertEquals(11, c4.GiveMeSize()); 
      int[] test1 = {1, 2, 3}; 
      assertEquals(3, c4.getSize(test1)); 
      int[] test2 = {1, 2};
      assertEquals(2, c4.getSize(test2)); 
      int[] test3 = {1, 2, 3, 4}; 
      assertEquals(4, c4.getSize(test3)); 
    } 
  
}
