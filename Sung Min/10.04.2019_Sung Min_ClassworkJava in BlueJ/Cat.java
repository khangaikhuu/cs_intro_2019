public class Cat
{
   public int legs = 4;
   public int age = 13;
   public boolean eatMouse = true;
   
   public Cat()
   {
       
    }
   public Cat(int x, int y, boolean z)
   {
       legs = x;
       age = y;
       eatMouse = z;
    }
   public int getAge()
   {
       return age;
    }
   public int getLegs()
   {
       return legs;
    }
   public boolean eatMouse()
   {
       return eatMouse;
    }
}
