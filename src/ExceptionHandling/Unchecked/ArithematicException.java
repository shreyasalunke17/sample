package ExceptionHandling.Unchecked;
public class ArithematicException
// Java Program to Illustrate Un-checked(Runtime) Exceptions
{
    public static void main(String[] args)
    {
        // Here we are dividing by 0 which will not be caught at compile time
        // as there is no mistake but caught at runtime because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;

    }
}



/*
Built-in Exceptions:
*Unchecked Exceptions

*Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain
certain error situations. Below is the list of important built-in exceptions in Java.

1)ArithmeticException: It is thrown when an exceptional condition has occurred in an arithmetic operation.

2)ArrayIndexOutOfBoundsException: It is thrown to indicate that an array has been accessed with an illegal index.
The index is either negative or greater than or equal to the size of the array.

3)ClassNotFoundException: This Exception is raised when we try to access a class whose definition is not found

4)FileNotFoundException: This Exception is raised when a file is not accessible or does not open.

5)IOException: It is thrown when an input-output operation failed or interrupted

6)InterruptedException: It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.

7)NoSuchFieldException: It is thrown when a class does not contain the field (or variable) specified

8)NoSuchMethodException: It is thrown when accessing a method that is not found.

9)NullPointerException: This exception is raised when referring to the members of a null object. Null represents nothing

10)NumberFormatException: This exception is raised when a method could not convert a string into a numeric format.

11)RuntimeException: This represents an exception that occurs during runtime.

12)StringIndexOutOfBoundsException: It is thrown by String class methods to indicate that an index is either negative
or greater than the size of the string

13)IllegalArgumentException : This exception will throw the error or error statement when the method receives an argument
which is not accurately fit to the given relation or condition. It comes under the unchecked exception.

14)IllegalStateException : This exception will throw an error or error message when the method is not accessed for the
particular operation in the application. It comes under the unchecked exception.
*/