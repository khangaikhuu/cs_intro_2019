

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SharkTest
{
    @Test
    public void testShark()
    {
       Shark c1 = new Shark();
       assertEquals (false, c1.JahsehIsDead());
       assertEquals (102, c1.Bullets(2));
    }
}
