

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test 
    public void TestClassworkOne() 
    { 
        ClassworkOne c4 = new ClassworkOne(1, "lol"); 
        assertEquals(6, c4.getStones(6)); 
        assertEquals(4, c4.getStones(4)); 
        assertEquals(5,c4.getStones(5)); 
        assertEquals("kys", c4.getMurda("kys")); 
        assertEquals("lol",c4.getMurda("lol")); 
        assertEquals("bruh",c4.getMurda("bruh")); 
    } 
}
