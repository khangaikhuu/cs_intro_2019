

public class LogicalOperation
{
   public boolean getOperation(boolean a, boolean b, boolean c)
   {
       return (a && b && c ) || (a || c ) || (c && b);
    }

}
