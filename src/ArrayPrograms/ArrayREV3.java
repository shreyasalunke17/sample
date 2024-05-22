package ArrayPrograms;
public class ArrayREV3
{
    //Given an array,store it in temporary array but in reverse order and then print all the elements of temp array
    public static void main(String[] args)
    {
        int[] input = {10, 9, 8, 7, 6, 5, 4};
        int[] tempArray = new int[input.length];
        int index = 0;
        for (int i = input.length - 1; i >= 0; i--)
        {
            tempArray[index] = input[i];
            index++;
        }
        for (int i = 0; i <= tempArray.length - 1; i++)
        {
            System.out.println(tempArray[i]);
        }
    }
}




/*
1. Using Temp array
The first method is as follows:

Take input the size of the array and the elements of the array.
Consider a function reverse which takes the parameters-the array(say arr) and the size of the array(say n).
Inside the function, a new array (with the array size of the first array, arr) is initialized.
The array arr[] is iterated from the first element, and each element of array arr[] is placed in the new array
from the back, i.e., the new array is iterated from its last element.
In this way, all the elements of the array arr[] are placed reversely in the new array.
Further, we can iterate through the new array from the beginning and print the elements of the array.
*/













