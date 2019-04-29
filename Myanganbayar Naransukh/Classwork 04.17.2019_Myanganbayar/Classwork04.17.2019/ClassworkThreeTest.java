

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkThreeTest
{
    @Test 
    public void ClassworkThree()
    {
        ClassworkThree c1 = new ClassworkThree();
        assertEquals(20, c1.getI(20));
        assertEquals(400, c1.loopI(20));
    }
}
