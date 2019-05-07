
public class MyArray
{
   private int [] myArrays1 = new int [5];
   private double [] myDoubleArray = {1.5, 2.0, 4.6, 6.7, 8.9};
   public int getSizeOfmyArray1()
   {
       return myArrays1.length;
    }
    public int getSizeofMyDoubleArray ()
    {
        return myDoubleArray.length;
    }
    public int getElement()
    {
        return myArrays1[2];
    }
    public double getElement2()
    {
        return myDoubleArray[1];
    }
    
}
