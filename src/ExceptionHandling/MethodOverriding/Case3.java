package ExceptionHandling.MethodOverriding;
//Java Program to Illustrate Exception Handling with Method Overriding
//Where SuperClass declares an exception and SubClass declares exceptions other than the child exception of the SuperClass declared Exception.
class SuperClass2
{
    // SuperClass declares an exception
    void method() throws RuntimeException
    {
        System.out.println("SuperClass");
    }
}
class SubClass2 extends SuperClass2
{
    //SubClass declaring an exception which are not a child exception of RuntimeException
    void method() //throws Exception
    {
        //Exception is not a child exception of the RuntimeException So the compiler will give an error
        System.out.println("SubClass");
    }
    public static void main(String[] args)
    {
        SuperClass2 s = new SubClass2();
        s.method();
    }
}


/*
Problem 2:if The SuperClass declares an exception. In this problem 3 cases will arise as follows:
Case 1: If SuperClass declares an exception and SubClass declares exceptions other than the child exception of the
SuperClass declared Exception.
Case 2: If SuperClass declares an exception and SubClass declares a child exception of the SuperClass declared Exception
Case 3: If SuperClass declares an exception and SubClass declares without exception

Now let us interpret these cases by implementing and interpreting with example

Case 1: If SuperClass declares an exception and SubClass declares exceptions other than the child exception of the
SuperClass declared Exception.
*/




