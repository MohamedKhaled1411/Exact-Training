package Research.Inheritance;

// Animal Class
class Animal
{
    public String name;

    public void setName(String name)
    {
        this.name = name;
    }
}

// Cat class extends animal class
class Cat extends Animal
{
    public String getName()
    {
        return name;
    }
}

// Inheritance relationship
class Inheritance
{
    public static void main (String[] args)
    {
        Cat cat = new Cat();

        cat.setName("Max");
        System.out.println(cat.getName());
    }
}
