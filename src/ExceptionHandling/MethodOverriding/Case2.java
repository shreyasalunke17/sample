package ExceptionHandling.MethodOverriding;
// Java Program to Illustrate Exception Handling with Method Overriding
// Where SuperClass doesn't declare any exception and SubClass declare Unchecked exception
class Superclass1
{
    // SuperClass doesn't declare any exception
    void method()
    {
        System.out.println("SuperClass");
    }
}
// SuperClass inherited by the SubClass
class Subclass1 extends Superclass1
{
    // method() declaring Unchecked Exception ArithmeticException
    void method() throws ArithmeticException
    {
        //ArithmeticException is of type Unchecked Exception so the compiler won't give any error
        System.out.println("SubClass");
    }
    public static void main(String[] args)
    {
        Superclass1 s = new Subclass1();
        s.method();
    }
}


/*
Case 2: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
*/



