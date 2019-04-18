
public class ClassworkOne
{
    private int a = 1;
    {
        a = a;
    }
    
    public int LoopNumbers (int loop)
    {
        for (int i = 1; i <=loop; i ++)
        {
            a = a + 2;
        }
        return a;
    }
}