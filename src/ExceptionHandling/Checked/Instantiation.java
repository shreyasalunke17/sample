package ExceptionHandling.Checked;
public class Instantiation
{
    public static void main(String[] args)
    {
        try
        {
            // Attempting to create an instance of an abstract class
            Object obj = AbstractClass.class.newInstance();
        }
        catch (InstantiationException e)
        {
            // Handling the InstantiationException
           // System.out.println("Instantiation error: " + e.getMessage());
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // Handling the IllegalAccessException
            System.out.println("Illegal access error: " + e.getMessage());
        }
    }
}
abstract class AbstractClass
{
    // An abstract method
    public abstract void printMessage();
}
