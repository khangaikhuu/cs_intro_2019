public class Sum_Of_First_Hundred_Numbers
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
