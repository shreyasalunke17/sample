package Overriding;
/*A method declared static cannot be overridden but can be re-declared.*/
public class OverridingRule6
{
    int  a=100;
    static int b=200;
    void test()
    {
        int a=100;
        System.out.println("This in instance variable");
        return;
    }
    static void test1()
    {
        System.out.println("This is a static method");
    }
    public static void main(String[] args)
    {
        test1();
        new OverridingRule6().test();
    }
}












/*
Can we override a static method?
No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static
methods are bonded using static binding at compile time. So, we cannot override static methods.

The calling of method depends upon the type of object that calls the static method.It means:
----------------------------------------------------------------------------------------------
If we call a static method by using the parent class object, the original static method will be called from the parent class.
If we call a static method by using the child class object, the static method of the child class will be called.*/

/*
public class OverridingRule6
{
public static void main(String args[])
{
ParentClass obj=new ChildClass();
pc.display();
}
}
class ParentClass
{
//we cannot override the display() method
public static void display()
{
System.out.printf("display() method of the parent class");
}
}
class ChildClass extends ParentClass
{
//the same method also exists in the ParentClass
//it does not override, actually it is method hiding
public static void display()
{
System.out.println("Overridden static method in Child Class in Java");
}
}

Output: display() method of the parent class */
