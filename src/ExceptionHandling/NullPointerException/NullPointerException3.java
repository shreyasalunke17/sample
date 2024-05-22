package ExceptionHandling.NullPointerException;
public class NullPointerException3
// A Java program to demonstrate that we can use Ternary operator to avoid NullPointerException.
{
    public static void main(String[] args)
    {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" : str.substring(0, 5);

        System.out.println(message);

        // Initializing String variable with null value
        str = "HelloJavaProgramming";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }
}

/*
Use of Ternary Operator:
The ternary operator can be used to avoid NullPointerException. First, the Boolean expression is evaluated.
If the expression is true then, the value1 is returned, otherwise, the value2 is returned. We can use the ternary
operator for handling null pointers:
*/

/*
This Java program demonstrates the use of the ternary operator to avoid a NullPointerException when working with strings.
Here's a breakdown of what's happening:

1)Initialize a String variable str with a null value.
2)Use the ternary operator to check if str is null. If it is null, assign an empty string to the message variable; otherwise,
assign the substring of str from index 0 to 4 (inclusive) to message.
3)Print the message.
4)Reinitialize str with a non-null value "HelloJavaProgramming".
5)Repeat the process: use the ternary operator to assign either an empty string or the substring of str to message.
6)Print the message.

This program effectively handles the case where the string is null by providing a default empty string.
It demonstrates how to avoid a NullPointerException in such scenarios.
*/