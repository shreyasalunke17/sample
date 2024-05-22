package Overriding;
/* Rule No:2 =>The argument list/method signature should be exactly the same as that of the overridden/parent class method. */
class A
{
    void test(int a)
    {
        System.out.println("This is a Superclass");
    }
}
class B extends A
{
    void test(int a)
    {
        System.out.println("This is a Subclass");
        super.test(a);
    }
}
public class OverridingRule2
{
    public static void main(String[] args)
    {
        A obj1 =new A();
        obj1.test(10);
        B obj2=new B();
        obj2.test(20);
    }
}


