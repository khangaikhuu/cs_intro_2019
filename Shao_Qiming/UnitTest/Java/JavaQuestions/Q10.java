
public class Q10
{
    private int i;
    private double A;
    private boolean local = false;
    private double[] MyArray = {12.3, 45.6, 13.4, 56.8, 2.5, 3.6, 18.7, 19.5};
    public boolean findMyElement(double A)
    {
        
    for(int i=0; i < MyArray.length; i++)
       {
            if (A == MyArray[i])
            {
                
                return true;
            }           
            
       }
       return local;
    }
    
}

