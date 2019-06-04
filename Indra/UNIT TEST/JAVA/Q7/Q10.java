public class Q10
{
   private int[] myArray1 = new int[8];
   private double[] myDoubleArray = {12.3, 45.6, 13.4, 56.8, 2.5, 3.6, 18.7, 19.5};
   
   public int getSizeOfmyArray1()
    {
        return myArray1.length;   
    }
    
    public int getSizeOfmyDoubleArray()
    {
        return myDoubleArray.length;
    }
    
    public int getElement()
    {
        return myArray1[2];
    }
    
    public double getElement2()
    {
        return myDoubleArray[1];
    }
}
