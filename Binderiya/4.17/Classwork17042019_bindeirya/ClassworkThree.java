

public class ClassworkThree
{
    private int a = 2;
    
    public int getA()
    {
        return a;
    }
    public int getLoop(int a)
    {
        int c = 1;
        for (int i = 2; i <= a; i++)
        {
            c = c + a;
        }
        return c;
    }
}
