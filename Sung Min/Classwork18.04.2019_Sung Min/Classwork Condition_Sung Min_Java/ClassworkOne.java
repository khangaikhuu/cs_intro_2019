public class ClassworkOne
{
    private int x = 2; 
    
    public ClassworkOne(int x)
    {
        x = x;
    }
    public int getX()
    {
        return x;
    }
    public int getLoop(int x)
    {
        int c = 1;
        for (int i = 2; i <= x; i++)
        {
            c = c * x;
        }
        return c;
    }
}

