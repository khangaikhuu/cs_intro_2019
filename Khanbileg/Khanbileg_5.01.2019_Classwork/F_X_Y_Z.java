
public class F_X_Y_Z
{ 
    public boolean X; 
    public boolean Y; 
    public boolean Z; 
    public boolean F_X_Y_Z(boolean X, boolean Y, boolean Z) 
    { 
        return  X && Y && Z || !(X) && !(Y);
    }
}