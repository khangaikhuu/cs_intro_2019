public class ClassworkOne
{
    private int a = 10;
    
    public ClassworkOne(int par1)
    {
        a = par1;
    }
    
    public int getA()
    {
        return a;
    }
    
    public int loop()
    {
        int sum = 0;
        for(int i=1; i<= 10; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}