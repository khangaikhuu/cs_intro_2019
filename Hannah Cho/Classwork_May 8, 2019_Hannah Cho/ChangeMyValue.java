

public class ChangeMyValue
{
       private int [] myArray = {1,2,3,4,19,25,23,45,12,58,14};
       public void changeValue(int index, int number)
       {
           myArray [index] = number;
        }
        public int getElement(int index)
       {
           return myArray[index];
        }
}
