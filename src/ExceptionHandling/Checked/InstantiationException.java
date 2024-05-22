package ExceptionHandling.Checked;
class InstantiationExcep
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
            System.out.println("Instantiation error: " + e.getMessage());
        }
        catch (IllegalAccessException e)
        {
            // Handling the IllegalAccessException
            System.out.println("Illegal access error: " + e.getMessage());
        }
    }
}
abstract class AbstractClasss
{
    // An abstract method
    public abstract void printMessage();
}
