

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrintMyNameTest
{
    @Test
    public void nameTest()
    {
        PrintMyName j = new PrintMyName();
        assertEquals("Amlyyina", j.getName());
    }
}
