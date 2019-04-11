

public class Cat
{
    private int legs;
    private int age;
    public boolean eatsMouse;
    
    public Cat(int x, int y, boolean z )
    {
      legs = x;
      age = y;
      eatsMouse = true;
    }
    
    public int getLegs()
    {
       return legs;
    }
    
    public int getAge()
    {
     return age;   
    }
    
    public boolean getEatsMouse()
    {
        return eatsMouse;
    }
  }    
