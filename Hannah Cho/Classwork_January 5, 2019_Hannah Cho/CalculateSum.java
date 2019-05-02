

public class CalculateSum
{
    public int loopNumbers(int sum)
    {
        int num = 0;
        for (int i = 1; i < 100; i++)
        {
            num = num + 1;
            sum = sum + num;
        }
        return sum;
    }
}
