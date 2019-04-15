

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintMyNameTestTest
{
   @Test
   public void nameTest()
   {
       PrintMyName j = new PrintMyName();
       assertEquals("Qiming", j.GetName());
   }
   
}
