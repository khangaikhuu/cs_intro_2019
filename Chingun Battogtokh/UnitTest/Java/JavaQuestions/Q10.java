

public class Q10
{
    private double myArray [] = {12.3, 45.6, 13.4, 56.8, 2.5, 3.6, 18.7, 19.5};
    private boolean findMyElement(double par) 
    { 
        boolean local = false; 
        for (int i = 0; i < myArray.length; i++) 
        { 
            if(par == myArray [i]) 
            { 
                local = true; 
            } 
        } 
        return local; 
    }
}
