

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicOpTest
{
    @Test 
    public void TestLogicOperation()
    {
        LogicOp l1 = new LogicOp();
        assertEquals(true, l1.LogicOp(true,true,true));
        assertEquals(true, l1.LogicOp(true,false,true));
        assertEquals(false, l1.LogicOp(false,false,false));
    }
}
