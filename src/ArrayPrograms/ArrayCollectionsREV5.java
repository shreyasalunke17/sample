package ArrayPrograms;
import java.util.*;
public class ArrayCollectionsREV5
// Reversing an array using Java collections
{
    // function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}

/*
3.Using Collections.reverse() method
The third method is to use the function java.util.Collections.reverse(List list) method.
This method reverses the elements in the specified list. Hence, we convert the array into a list first by using
java.util.Arrays.asList(array) and then reverse the list.
*/