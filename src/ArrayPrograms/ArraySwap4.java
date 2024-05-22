package ArrayPrograms;
public class ArraySwap4
{
    // function swaps the array's first element with last element,second element with last second element and so on
    static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        // printing the reversed array
        System.out.print("Reversed array is: \n");
        for (k = 0; k < n; k++)
        {
            System.out.println(a[k]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }
}

/*
2.Using Swapping
The second method uses a similar code for the inputting and printing of the array.
However,we don’t create a new array like the above method. Instead, we reverse the original array itself.
In this method, we swap the elements of the array. The first element is swapped with the last element.
The second element is swapped with the last but one element and so on.
For instance, consider array [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and further.
*/