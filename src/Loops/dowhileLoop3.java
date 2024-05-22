package Loops;
public class dowhileLoop3
{
    public static void main(String[] args)
    {
        //Declaring and initializing integer values
        int x = 21, sum = 0;
        do
        {
            //Here,the line will be printed even if the condition is false
            sum += x;
            x--;
        }
        while (x > 10);   //Now checking condition

        System.out.println("Summation: " + sum);   //Summing up

    }
}















