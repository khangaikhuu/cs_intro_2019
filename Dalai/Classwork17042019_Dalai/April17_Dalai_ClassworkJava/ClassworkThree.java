public class ClassworkThree
{
    private int Butt = 8;
    
    public ClassworkThree(int par1)
    {
        Butt = par1;
    }
    
    public int getButt()
    {
        return Butt;
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
