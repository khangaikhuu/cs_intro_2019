
public class MyClass
{
    public int myMethod()
    {
        return 1;
    }
    public int myMethod(int parameter)
    {
        return parameter;
    }
    public void callMethodInsideAMethod()
    {
        int localVariable = myMethod();
    }
}
