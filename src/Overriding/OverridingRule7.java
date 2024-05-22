package Overriding;
/* Rule No:7 If a method cannot be inherited then it cannot be overridden. Ex:private methods in super class.*/
class Parent
{
    public Parent()
   {
        name();
        normal();
    }
    private void name()
    {
        System.out.println("Private method inside Parent class");
    }
    public void normal()
    {
        System.out.println("Non private method from Parent class can be overridden");
    }
}
class Child extends Parent
{
    private void name()
    {
        System.out.println("Private method inside Child class");
    }
    public void normal()
    {
        System.out.println("Non private overridden method from Child class");
    }
}
public class OverridingRule7
{
    public static void main(String[] args)
    {
        Parent obj=new Child();
    }
}








/**
 *Java program to demonstrate that private method can not be overridden in Java.
 *This Java program calls both private and non-private methods with child class
 *object on the constructor of the parent class.
 *Only non-private method of Child class invoked while the private method of
 *Parent class is invoked, Which confirms that the private method can not be overridden in Java
 *and only be hidden if we declare the same message in Child class.*/


/*This example has two classes Parent and Child each contains two methods with the same name and same signature,
one of them is a private method and the other is non-private, public in this case.
On constructor of Parent class, we call both private and non-private method and Output shows that overriding
only applies in case of non-private method.
By the way,calling an overridden method from a constructor is considering as bad practice and I have just
shown here to demonstrate that we can not override the private method in Java.*/















