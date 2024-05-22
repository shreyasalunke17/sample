package ExceptionHandling.MethodOverriding;
//Java Program to Illustrate Exception Handling with Method Overriding
//Where SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception
class SuperClass3
{
    //SuperClass declares an exception
    void method() throws RuntimeException
    {
        System.out.println("SuperClass");
    }
}
class SubClass3 extends SuperClass3
{
    // SubClass declaring a child exception of RuntimeException
    void method() throws ArithmeticException
    {
        //ArithmeticException is a child exception of the RuntimeException So the compiler won't give an error
        System.out.println("SubClass");
    }
    public static void main(String[] args)
    {
        SuperClass s = new SubClass();
        s.method();
    }
}


/*
Case 2: If SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception
*/

