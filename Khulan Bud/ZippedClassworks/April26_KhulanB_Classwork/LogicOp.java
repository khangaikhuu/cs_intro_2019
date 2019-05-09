public class LogicOp extends SubtractNumbers
{ 
    public boolean LogicOp(boolean A, boolean B,boolean C) 
    { 
        return (A && B && C ) || (A || C ) || (C && B); 
    } 
}
