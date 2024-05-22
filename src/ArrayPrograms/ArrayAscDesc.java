package ArrayPrograms;
public class ArrayAscDesc
{
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        //length  = 5
        //last index = 4 (0 1 2 3 4)
        //ascending = 1 2 3 4 5
        //descending= 5 4 3 2 1
        // index   =  0 1 2 3 4

        for(int i=0; i <=arr.length - 1; i++) //Ascending order index
        {
            System.out.println("Value at index "+i + "  in given array is "+arr[i]);
        }

        /*
        for(int i=arr.length - 1;i >= 0;i--) //Descending order index
        {
            //i = 4
            //i = 3
            //i = 2
            //i = 1
            //i = 0
            System.out.println("Value at index "+i+" in given array is "+arr[i]);
        }
        */
    }
}































