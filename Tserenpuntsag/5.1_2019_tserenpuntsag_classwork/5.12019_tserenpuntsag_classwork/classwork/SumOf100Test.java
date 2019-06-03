package classwork;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumOf100Test
{
    @Test
   public void TestSumOf100() 
   { 
       SumOf100 c4 = new SumOf100();
       assertEquals(5050, c4.SumOf100()); 
    }
}
