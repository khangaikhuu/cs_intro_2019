
public class ClassworkOne
{
    private int a = 0;
    
    public ClassworkOne (int abc)
    {
        int a = abc;
    }
    public int getA ()
    {
        return a;
    }
    public int getLoop (int a)
    {
        int b = 1;
        for (int i=1; i<= a; i++)
        {
            b = b * a;
        }
        return b;
    }
}
