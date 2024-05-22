package DecisionMaking;
public class nestedifProg4
{
    public static void main(String[] args)
    {
        int n=24;
        //if else condition to check whether the number is even or odd
        if (n % 2 == 0)
        {
            System.out.print("Even ");
            //nested if else condition to check if n is divisible by 6 or not
            if (n % 6 == 0)
            {
                System.out.println("and divisible by 6");
            }
            else
            {
                System.out.println("and not divisible by 6");
            }
        }
        else
        {
            System.out.println("Odd");
            //nested if else condition to check if n is divisible by 3 or not
            if(n % 3 == 0)
            {
                System.out.println("and divisible by 3");
            }
            else
            {
                System.out.println("and not divisible by 3");
            }
        }

    }
}
