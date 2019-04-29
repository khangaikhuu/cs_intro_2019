

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicOpTest
{
   @Test 
   public void TestLogicOp() 
   { 
       LogicOp c4 = new LogicOp(); 
       assertEquals(false, c4.LogicOp(false,false,false)); 
       assertEquals(true, c4.LogicOp(true,true,true)); 
       assertEquals(false, c4.LogicOp(false,true,false)); 
    }
}
