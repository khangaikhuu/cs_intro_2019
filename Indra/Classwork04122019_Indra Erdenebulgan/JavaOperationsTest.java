

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaOperationsTest
{
   @Test
   public void nameTest()
   {
       JavaOperations j = new JavaOperations();
       assertEquals("Indra",j.getName());
   }
}
