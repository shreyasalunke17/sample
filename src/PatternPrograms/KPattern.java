package PatternPrograms;
public class KPattern
{
    public static void printPattern(int n)
    {
        int i, j;
        for (i = n; i >= 1; i--)        //outer loop to handle rows
        {
            for (j = 1; j <= i; j++)    //inner loop to handle columns
                {
                  System.out.print("*");
                }
            System.out.println();       //printing new line for each row
        }
        for (i = 2; i <= n; i++)        //outer loop to handle rows
            {
            for (j = 1; j <= i; j++)    //inner loop to handle columns
                {
                  System.out.print("*");
                }
            System.out.println();        //printing new line for each row
            }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}




































