

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test 
    public void TestClassworkTwo() 
    { 
        ClassworkTwo c4 = new ClassworkTwo(1, "haha", 5.5);
        assertEquals(5, c4.getDeath(5)); 
        assertEquals("lol", c4.getWar("lol")); 
        assertEquals(7.5, c4.getCide(6.5), 1); 
    } 
}
