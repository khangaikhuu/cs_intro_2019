

public class ClassworkTwo
{
    private int a;
    private int b;
    public ClassworkTwo(int a, int b)
    {
        a = a;
        b = b;
}
private int getA ()
{
    return a;
}
private int getB ()
{
    return b;
}
private int getSum() 
{
    return a + b;
}
  
   
private int getQuiotient()
{
    return a * b;
}

private int c = 1;
    public int loopnumbers(int loop)
    {
        for (int i = 1; i <= loop; i++)
        {
            c = loop * c ;
        }
        return c ;
    }
}


