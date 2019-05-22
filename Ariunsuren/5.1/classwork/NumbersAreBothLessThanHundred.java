

public class NumbersAreBothLessThanHundred
{
    public boolean lessThanHundred(int a, int b)
    {
        if (a < 100)
        {
            if (b < 100)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }
}
