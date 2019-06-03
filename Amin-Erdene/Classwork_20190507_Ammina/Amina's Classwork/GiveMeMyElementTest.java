
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GiveMeMyElementTest
{
    @Test
    public void TestGiveMeMyElement()
    {
       GiveMeMyElement ma = new GiveMeMyElement();
       assertEquals(1, ma.getIndex(0));
       assertEquals(19, ma.getIndex(4));
       assertEquals(23, ma.getIndex(6));
    }
}
