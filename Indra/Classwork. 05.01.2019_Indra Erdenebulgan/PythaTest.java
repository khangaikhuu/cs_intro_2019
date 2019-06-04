

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythaTest
{ @Test 
    public void TestPytha() 
    { 
        Pytha c4 = new Pytha(); 
        assertEquals(1.41, c4.Pytha(1,1),1); 
        assertEquals(2.83, c4.Pytha(2,2),1); 
        assertEquals(4.24, c4.Pytha(3,3),1); 
    } 
}
