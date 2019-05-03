

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythaTest
{ @Test 
    public void TestPytha() 
    { 
        Pytha c4 = new Pytha(); 
        assertEquals(6.708203932499369, c4.Pytha(3,6),1); 
        assertEquals(7.280109889280518, c4.Pytha(2,7),1); 
        assertEquals(8.06225774829855, c4.Pytha(1,8),1); 
    } 
}
