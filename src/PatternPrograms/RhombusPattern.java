package PatternPrograms;
public class RhombusPattern
{
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++)      //outer loop to handle number of rows
            {
            for (j = 1; j <= n - i; j++)     //inner loop to print spaces
                {
                System.out.print(" ");
            }
            for (j = 1; j <= n; j++)    //inner loop to print stars
                {
                System.out.print(" * ");
            }
            System.out.println();    //printing new line for each row

            }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}




































