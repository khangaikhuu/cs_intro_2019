
public class ClassworkTwo
{
    private int a;
    private int b;
    
    public ClassworkTwo(int parameter1, int parameter2)
    {
        a = parameter1;
        b = parameter2;
    }
    
    public int getSum()
    {
        return a + b;
    }
    public int getQuotient()
    {
        return a * b;
    }
    public int getA(int a)
    {
        return a;
    }
    
    public int loopnumber(int loop)
    {
        int c = 1;
        for (int i = 1; i <= loop; i++)
        {
            c = c * loop;
        }
        return c;
    }
    
}
