
public class Equals
{
    public int a;
    public int b;
    public boolean Equals(int a, int b)
    {
        if(a > b)
        {
           return false;
        }
        if(b > a)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
