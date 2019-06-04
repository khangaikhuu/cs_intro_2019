

public class MyClass 
{
    public static void main(String args[])
    {
        
        prog();   
    }
    
    public static int[] prog()
    {
        int array[] = {1,2,3,4,5};

        for(int i=0;i<5;i++)
        {
            array[i] = array[i] + 25;
        }
        return array;
    }
}