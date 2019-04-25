
public class Cat
{
   public int legs;
   public int age;
   public boolean eatsMouse = true;
   public Cat()
   {
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
    public Cat(int x, int y, boolean z)
    {
        legs = x; 
        age = y;
        eatsMouse = z;
    }
}
