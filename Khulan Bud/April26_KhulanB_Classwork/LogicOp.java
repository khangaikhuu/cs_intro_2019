
public class LogicOp extends SubtractNumbers
{ 
    public boolean A; 
    public boolean B; 
    public boolean C; 
    public boolean LogicOp(boolean A, boolean B,boolean C) 
    { 
        return (A && B && C ) || (A || C ) || (C && B); 
    } 
}
