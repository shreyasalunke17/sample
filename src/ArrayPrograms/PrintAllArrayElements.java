package ArrayPrograms;
public class PrintAllArrayElements
{
    public static void main(String[] args)
    {
        int[] arr={2,4,5,6,2,7,9,9,3,4,66,88,48,34,22,23};
        //starting index for array is 0

        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.println("Value at index "+i+" in given array is "+arr[i]);
        }

    }
}