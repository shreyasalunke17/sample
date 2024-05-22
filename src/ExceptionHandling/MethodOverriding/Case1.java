package ExceptionHandling.MethodOverriding;
import java.io.*;
//Java Program to Illustrate Exception Handling with Method Overriding
//Where SuperClass does not declare any exception and subclass declare checked exception
class SuperClass
{
    // SuperClass doesn't declare any exception
    void method()
    {
        System.out.println("SuperClass");
    }
}
class SubClass extends SuperClass
{
    // method() declaring Checked Exception IOException
    void method() //throws IOException
    {
        // IOException is of type Checked Exception so the compiler will give Error
        System.out.println("SubClass");
    }
    public static void main(String[] args)
    {
        SuperClass s = new SubClass();
        s.method();
    }
}

/*
Exception Handling with Method Overriding
---------------------------------------------
When Exception handling is involved with Method overriding, ambiguity occurs.The compiler gets confused as to
which definition is to be followed.

Types of problems:
There are two types of problems associated with it which are as follows:
Problem 1:  If The SuperClass doesn’t declare an exception
Problem 2: If The SuperClass declares an exception

Let us discuss different cases under these problems and perceived their outputs.
Problem 1:  If The SuperClass doesn’t declare an exception
In this problem, two cases that will arise are as follows:
Case 1: If SuperClass doesn’t declare any exception and subclass declare checked exception
Case 2: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
--------------------------------------------------------------------------------------------------------------------
Case 1: If SuperClass doesn’t declare any exception and subclass declare checked exception.
*/

