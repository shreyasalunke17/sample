package Loops;
public class WhileLoop3
{
    public static void main(String[] args)
    {
        int x=1, sum=0;

        while (x <= 10)        //Exit when x becomes greater than 4
            {
                sum=sum + x;     //summing up x
                x++;
            }

        System.out.println("Summation: " +sum);
    }
}



/*
Complexity of the above method
Time Complexity: O(1)
Auxiliary Space : O(1)
*/

































