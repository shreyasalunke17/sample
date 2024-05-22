package ExceptionHandling;
public class ChainedException
// Java program to demonstrate working of chained exceptions
{
    public static void main(String[] args)
    {
        try
        {
            // Creating an exception
            NumberFormatException ex = new NumberFormatException("Exception");

            // Setting a cause of the exception
            ex.initCause(new NullPointerException("This is actual cause of the exception"));

            // Throwing an exception with cause.
            throw ex;
        }
        catch(NumberFormatException ex)
        {
            // displaying the exception
            System.out.println(ex);

            // Getting the actual cause of the exception
            System.out.println(ex.getCause());
        }
    }
}
/**
 * Chained Exceptions allows to relate one exception with another exception, i.e one exception describes cause
 of another exception. For example, consider a situation in which a method throws an ArithmeticException because
 of an attempt to divide by zero but the actual cause of exception was an I/O error which caused the divisor to be zero.
 The method will throw only ArithmeticException to the caller. So the caller would not come to know about the actual cause
 of exception. Chained Exception is used in such type of situations.

 *Constructors Of Throwable class Which support chained exceptions in java :
 1)Throwable(Throwable cause) :- Where cause is the exception that causes the current exception.
 2)Throwable(String msg, Throwable cause) :- Where msg is the exception message and cause is the exception that
 causes the current exception.

 * Methods Of Throwable class Which support chained exceptions in java :
 1)getCause() method :- This method returns actual cause of an exception.
 2)initCause(Throwable cause) method :- This method sets the cause for the calling exception.
 */

/*
Chained exceptions, also known as nested exceptions,allow you to associate a cause with an exception in Java.
This is useful when you want to propagate information about the original cause of an exception.
*/