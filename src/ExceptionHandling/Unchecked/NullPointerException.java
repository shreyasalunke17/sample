package ExceptionHandling.Unchecked;
public class NullPointerException
{
    public static void main(String[] args)
    {
        String str = null;
        int length = str.length(); // Throws NullPointerException
    }
}

