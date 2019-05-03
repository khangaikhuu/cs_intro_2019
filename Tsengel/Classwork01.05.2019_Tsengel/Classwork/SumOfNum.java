
public class SumOfNum
{
   public int loopNumbers()
    { 
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 100; i++)
        {
            num = num + 1;
            sum = sum + num;
        }
        return sum;
    }
}
