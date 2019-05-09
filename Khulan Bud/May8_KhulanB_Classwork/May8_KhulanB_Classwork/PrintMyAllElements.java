
public class PrintMyAllElements
{
  private String[] myArray = {"hello","world","test","final","exam","grades","failing exam","graduation","preparation"};
  public void getAllElements()
  {
      for (int i = 0; i < myArray.length; i++)
      {
          System.out.println(myArray[i]);
       }
    }
}