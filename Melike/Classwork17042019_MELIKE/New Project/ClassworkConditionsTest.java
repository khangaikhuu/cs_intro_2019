

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkConditionsTest
{
    @Test
    public void testIsBigger()
    {
        ClassworkConditions cc = new ClassworkConditions ();
        assertEquals(true, cc.isBigger());
    }
}
