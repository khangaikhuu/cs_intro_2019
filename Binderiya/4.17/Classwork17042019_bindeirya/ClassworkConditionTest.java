import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkConditionTest
{
    @Test
    public void testIsBigger()
    {
       ClassworkCondition cc = new ClassworkCondition();
       assertEquals(true, cc.isBigger());
       
    }
}
