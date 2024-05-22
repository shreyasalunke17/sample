package ExceptionHandling.ExcepHandledTryCatch;
public class ExceptionArithmetic
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(11/0);
        }
        catch (ArithmeticException e)
        {
            //These are the methods to print exception
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("This is Arithmetic Exception");
       }
    }
}















