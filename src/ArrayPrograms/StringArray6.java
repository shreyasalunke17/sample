package ArrayPrograms;
import java.util.Arrays;
public class StringArray6
// Java Program for Reversing an array using StringBuilder
{
    public static void main (String[] args)
    {
        String[] arr = {"Hello","World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--)
        {
            reversed.append(arr[i - 1]).append(" ");
        };

        String[] reversedArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));
    }
}

/*
4.Using StringBuilder.append() method
As a fourth method, If you are working with a String array, we can use a StringBuilder and append each array element
with a for loop decrementing from the array’s length, convert the StringBuilder to a string, and split back into an array.
*/