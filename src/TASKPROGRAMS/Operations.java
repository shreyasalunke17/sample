package TASKPROGRAMS;
import java.util.Scanner;
public class Operations
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter First Number=");
        int a=scanner.nextInt();
        System.out.print("Enter Second Number=");
        int b=scanner.nextInt();

        int add=a+b;
        int subtract=a-b;
        int multiply=a*b;
        float divide=(float)a/b;

        System.out.println("Addition = "+add);
        System.out.println("Subtraction = "+subtract);
        System.out.println("Multiplication = "+multiply);
        System.out.println("Division = "+divide);
    }
}