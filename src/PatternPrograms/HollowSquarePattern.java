package PatternPrograms;
import java.util.*;
public class HollowSquarePattern
{
    public static void printPattern(int n)
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        n = sc.nextInt();
        for (i = 0; i < n; i++)                 //outer loop to handle number of rows
            {
            for (j = 0; j < n; j++)             //inner loop to handle number of columns
                {
                                                //star will print only when it is in first row or last row or first column or last column
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                {
                    System.out.print("*");
                }
                else                            //otherwise print space only
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}

































