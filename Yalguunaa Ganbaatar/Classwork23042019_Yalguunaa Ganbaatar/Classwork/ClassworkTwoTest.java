
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo l1 = new ClassworkTwo(1, "pizza", 1.0);
        assertEquals(1,l1.getThor(1));
        assertEquals("pizza",l1.getHammer("pizza"));
        assertEquals(1.0,l1.getSpoiler(1.0),1);
        assertEquals(3,l1.getThor(3));
        assertEquals("party",l1.getHammer("party"));
        assertEquals(1.5,l1.getSpoiler(1.5),1);
        assertEquals(45,l1.endgame());
    }
}
