
public class Sum100
{
    private int sum = 0;
    public int Sum()
    {
        int num = 0;
        for(int i = 0; i<100; i++)
        {
            num = num + 1;
            sum = sum + num;
        }
        return sum;
    }
}
