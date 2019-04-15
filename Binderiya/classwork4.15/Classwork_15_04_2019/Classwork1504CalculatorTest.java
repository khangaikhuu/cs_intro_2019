import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Classwork1504CalculatorTest
{
    @Test 
    public void testMyMethod()
    {
        Classwork1504Calculator c1 = new Classwork1504Calculator();
        assertEquals(8, c1.calculateAddition(4,4));
        assertEquals(10, c1.calculateAddition(5,5));
        assertEquals(0, c1.calculateSubtraction(4,4));
        assertEquals(1, c1.calculateDivision(4,4));
        assertEquals(16, c1.calculateMultiplication(4,4));
        assertEquals(0, c1.calculateModulo(20, 4));
        assertEquals(0, c1.calculateSubtraction(5,5));
        assertEquals(25, c1.calculateMultiplication(5,5));
        assertEquals(1, c1.calculateDivision(5,5));
        assertEquals(0, c1.calculateModulo(25, 5));
      }
    


}