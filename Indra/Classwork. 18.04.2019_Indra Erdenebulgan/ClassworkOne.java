public class ClassworkOne
{
    private int a = 1;
    
    public ClassworkOne(int a)
    {
        a = a;
    }
    public int getA()
    {
        return a;
    }
    public int getLoop(int a)
    {
        int c = 1;
        for (int i = 1; i <= a; i++)
        {
            c = c * a;
        }
        return c;
    }
}
