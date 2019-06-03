

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PythagorianTheoremTest
{
    @Test 
    public void PythagorianTheorem() 
    { 
        PythagorianTheorem c4 = new PythagorianTheorem(); 
        assertEquals(1.41, c4.Pytha(1,1),1); 
        assertEquals(2.83, c4.Pytha(2,2),1); 
        assertEquals(4.24, c4.Pytha(3,3),1); 
    } 
}
