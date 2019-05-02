
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RelativityTest
{
    @Test
    public void testRelativity()
    {
        Relativity q1 = new Relativity();
        assertEquals(1.79751026154005E31,q1.calcRel(2),1);
        assertEquals(3.5950205230801e31,q1.calcRel(4),1);
        assertEquals(1.79751026154005e32,q1.calcRel(20),1);
    }
}
