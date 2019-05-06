public class LogicalOperation
{
    public boolean getLogicalOperation(boolean A, boolean B, boolean C)
    {
        return (A && B && C) || (A || C) || (C && B);
    }
}
