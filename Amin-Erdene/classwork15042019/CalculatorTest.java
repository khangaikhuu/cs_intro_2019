
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void TestMyMethod()
    {
        Calculator c1 = new Calculator();
        assertEquals(3, c1.calculateAddition(1,2));
        assertEquals(4, c1.calculateAddition(2,2));
        assertEquals(6, c1.calculateSubtraction(9,3));
        assertEquals(10, c1.calculateSubtraction(15,5));
        assertEquals(8, c1.calculateMultiplication(4,2));
        assertEquals(16, c1.calculateMultiplication(8,2));
        assertEquals(2, c1.calculateDivision(4,2));
        assertEquals(9, c1.calculateDivision(18,2));
        assertEquals(1, c1.calculateModulo(3,2));
        assertEquals(1, c1.calculateModulo(21,4));
    }
}
