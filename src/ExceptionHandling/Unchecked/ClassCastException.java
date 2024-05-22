package ExceptionHandling.Unchecked;
public class ClassCastException
{
    public static void main(String[] args)
    {
        Object obj = "Hello";
        Integer num = (Integer) obj; //Throws ClassCastException
    }
}










