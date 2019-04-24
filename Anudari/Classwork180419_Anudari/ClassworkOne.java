
public class ClassworkOne
{
    private int a = 1;
    
    public ClassworkOne (int parameter)
    {
        a = parameter;
    }
    public int getA()
    {
        return a;
    }
      public void setA(int parameter)
    {
        a = parameter;
    }
  public int loopnumbers(int loop)
    {
        for (int i = 1; i <= loop; i++)
        {
            a = a * a;
        }
        return a;
    }
}
    
