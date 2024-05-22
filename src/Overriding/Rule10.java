package Overriding;
/* Rule No:10 => Constructors cannot be overridden. */
class DemoTest{
    void DemoTest()
    {
        System.out.println("This is the constructor of the demo class");
    }
}
class OverridingConstructor extends DemoTest
{
    void DemoTest()
    {
        System.out.println("This is the constructor of the demo class");
    }
    public static void main(String[] args)
    {
        DemoTest obj=new DemoTest();
    }
}


















/*If super class and sub class have same methods including name,return type and parameters,
and if you try to call it using the object of the sub class.
Then the method in the sub class is invoked.
Constructor looks like method but it is not.It does not have a return type and its name is same as the class name.
But,a constructor cannot be overridden. If you try to write a super class’s constructor in the sub class compiler
treats it as a method and expects a return type and generates a compile time error. */