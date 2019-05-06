

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BigNumTest
{
    @Test
    public void TestBigNum()
    {
        BigNum n1 = new BigNum();
        assertEquals(2, n1.BigNum(1, 2));
        assertEquals(3, n1.BigNum(2, 3));
        assertEquals(4, n1.BigNum(3, 4));
    }
}
