package ExceptionHandling.Checked;
import java.io.*;
class FileNotFoundExcep
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Assigning null value to object of FileInputStream
        FileInputStream GFG = null;

        // Try block to check for exceptions
        try
        {
            // Giving path where file should exists to read content
            GFG = new FileInputStream("/Home/Shreya/ABC.txt");
        }
        // Catch block to handle exceptions
        catch (FileNotFoundException e)
        {
            System.out.println("File Does Not Exist");
        }
    }
}




/*
How to handle FileNotFoundException. The answer is quite simple as we can handle it with the help of a try-catch block
Declare the function using the throw keyword to avoid a Compilation error.
All the exceptions throw objects when they occur try statement allows you to define a block of code to be tested for
errors and catch block captures the given exception object and perform required operations.
Using a try-catch block defined output will be shown.
*/