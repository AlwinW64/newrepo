// You are using Java
import java.util.*;
class ObjectOriented
{
    public static void main(String[] args)
    {
        Animal bob = new Animal("bob", 10, "dog");
        bob.displayname();
        bob.displayage();
        bob.displaytype();
    }
}
class Animal
        {
            String name;
            int age;
            String type;

            public Animal(String n, int a, String t)
            {
                name = n;
                age = a;
                type = t;
            }
            public void displayname()
            {
                System.out.println(name);
            }
            
            public void displayage()
            {
                System.out.println(age);
            }
            public void displaytype()
            {
                System.out.println(type);
            }
        }