public class SumOf100
{
    public int first100()
    {
        int num = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            num = num + 1;
            sum = sum + num;
        }
        return sum;
    }
}
