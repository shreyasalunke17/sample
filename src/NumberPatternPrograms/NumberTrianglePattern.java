package NumberPatternPrograms;
public class NumberTrianglePattern
{
    public static void printPattern(int n)
    {
        int i, j;
        for(i = 1; i <= n; i++)            //outer loop to handle number of rows
            {
            for(j = 1; j <= n - i; j++)    //inner loop to print space
                {
                System.out.print(" ");
                }
            for (j = 1; j <= i; j++)       //inner loop to print star
                {
                System.out.print(i + " ");
                }
            System.out.println();         //print new line for each row
            }
    }
    public static void main(String[] args)
    {
        int n=6;
        printPattern(n);
    }
}






































