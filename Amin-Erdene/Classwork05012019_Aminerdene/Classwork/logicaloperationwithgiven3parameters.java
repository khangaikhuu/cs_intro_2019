
public class logicaloperationwithgiven3parameters
{
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean logicaloperationwithgiven3parameters(boolean A, boolean B, boolean C)
   {
       return (A && B && C) || (A || C) || (C && B);
   }
}
