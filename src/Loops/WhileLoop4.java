package Loops;
import java.util.Scanner;

public class WhileLoop4
{
    public static void main(String[] args)
    {
        int sum = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues until entered number is positive
        while (number >= 0)
        {
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}

/*
In the above program, we have used the Scanner class to take input from the user.
Here,nextInt() takes integer input from the user.
The while loop continues until the user enters a negative number. During each iteration,
the number entered by the user is added to the sum variable.
When the user enters a negative number, the loop terminates. Finally, the total sum is displayed.
*/











