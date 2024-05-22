package Constructor;
class tester
{
    tester(String name)
    {
        System.out.println("Constructor with one argumet : " +name);
    }
    tester(String name,int age)
    {

        System.out.println("Constructor with two arguments : " +name+ " " +age);
    }
    tester(long id)
    {
        System.out.println("Constructor with one argument : " +id);
    }
}
public class Constructor2
{
    public static void main(String[] args)
    {
        tester obj1 = new tester("Java");
        tester obj2 = new tester("James Gosling",20);
        tester obj3 = new tester(123456789);
    }
}

