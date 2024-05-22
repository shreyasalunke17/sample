package ConstructorThisKeyword;
//The first line in each constructor can be super or this but not both
class C11
{
    public C11()
    {
        //this("Test",10);
        System.out.println("line no 6 Default constructor");
    }
    public C11(String a)
    {
        //this();
       this("Test",100);
        System.out.println("line no 11 Parameterized constructor ");
    }
    public C11(String a,int b)
    {
       this();
        System.out.println("line no 15 Double Parameterized constructor ");
    }
}
public class ConstructorThis1
{
    public static void main(String[] args)
    {
        C11 cc = new C11("Java");    // 6 15 11    15 6 11
    }
}





















/* Rules for Constructor Chaining
The constructor's definition should always start with the this() or super() method as the initial statement.
There should be at least one constructor in the class that does not include this() method.
The constructor chaining can be performed in any sequence.

Constructor Calling from Another Constructor
There are two methods for invoking the constructors:
Using this() method:
The this() method is used to call one constructor from another constructor within the same class.
The this() method can only be used inside a constructor.
It must be the first statement with appropriate arguments in a constructor.

Using super() method:
The super() method is used to call the immediate parent constructor from the child class constructor.
The super() method can only be used inside a constructor.
super() should also be the first statement with appropriate arguments in the child class's constructor. */