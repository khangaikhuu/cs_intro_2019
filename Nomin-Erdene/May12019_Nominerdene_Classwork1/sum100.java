
public class sum100
{
    private int sum = 0;

    private int i = 0;
    public int calcSum()
    {
        int num = 0;
        for(i = 0; i<100; i++)
        {
            num = num + 1;
            sum = sum + num;
        }
        return sum;
    }
}
