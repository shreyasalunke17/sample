package ExceptionHandling.Unchecked;
public class NumberFormatException
{
    public static void main(String[] args)
    {
        String str = "abc";
        int number = Integer.parseInt(str); //Throws NumberFormatException
    }
}

