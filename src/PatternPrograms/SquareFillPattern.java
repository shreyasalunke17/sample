package PatternPrograms;
public class SquareFillPattern
{
    public static void printPattern(int n)
    {
        int i,j;
        for (i = 1; i <= n; i++)      //outer loop to handle rows-Horizontal
            {
            for (j = 0; j <= n; j++)   //inner loop to handle columns-Vertical
                {
                System.out.print(" * ");
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



































