package NumberPatternPrograms;
public class ZeroOneTriangle
{
    public static void printPattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++)        //outer loop to handle number of rows
        {
            for (j = 1; j <= i; j++)    //inner loop to handle number of columns

            {
                if ((i + j) % 2 == 0)   //if the sum of (i+j) is even then print 1
                {
                    System.out.print(1 + " ");
                }
                else                    //otherwise print 0
                {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();       //printing new line for each row
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}

