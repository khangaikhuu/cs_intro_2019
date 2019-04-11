
public class Cat
{
   public int legs = 4;
   public int age = 3;
   public boolean eatsMouse = true;
   public Cat()
   {
   }
   public Cat(int x, int y, boolean z)
   {
      legs = x;
      age = y;
      eatsMouse = z;
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
