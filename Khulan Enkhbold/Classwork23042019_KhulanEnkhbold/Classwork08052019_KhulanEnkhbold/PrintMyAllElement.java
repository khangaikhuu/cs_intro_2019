package Classwork08052019_KhulanEnkhbold;


public class PrintMyAllElement
{
  private String[] myArray = {"hello", "World", "Test", "Final", "Exam", "Grades"};
  public void getAllElements()
  {
      for (int i = 0; i < myArray.length; i++)
      {
          System.out.println(myArray[i]);
        }
    }
}

