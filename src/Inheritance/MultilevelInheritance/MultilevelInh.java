package Inheritance.MultilevelInheritance;
class One
{
    public void print()
    {
        System.out.println("Multilevel");
    }
}
class Two extends One
{
    public void show()
    {
        System.out.println("Inheritance");
    }
}
class Three extends Two
{
    public void display()
    {
        System.out.println("Java");
    }
}
public class MultilevelInh
{
    public static void main(String[] args)
    {
        Three obj = new Three();
        obj.print();
        obj.show();
        obj.display();
    }
}

