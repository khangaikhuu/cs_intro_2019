

public class MyArray
{
   private int [] myArray = new int[5];
   private double [] myDoubleArray = { 1.0, 2.0, 3.5, 4.5, 5.5, 6.5};
   public int getSizeOfmyArray()
  
   {
       return myArray.length;
    }
    
    public int getSizeOfmyDoubleArray()
    {
        return myDoubleArray.length;
    }
    public int getElement()
    {
        return myArray[2];
    }
    public double getElement2()
    {
        return myDoubleArray[1]; 
    }
}
