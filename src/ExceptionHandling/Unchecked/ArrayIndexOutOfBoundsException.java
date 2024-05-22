package ExceptionHandling.Unchecked;

public class ArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        System.out.println(arr[10]); //Throws ArrayIndexOutOfBoundsException
    }
}

