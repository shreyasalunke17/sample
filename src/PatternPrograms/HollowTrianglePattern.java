package PatternPrograms;
public class HollowTrianglePattern
{
    public static void printPattern(int n)
    {
        int i, j, k;
        for (i = 1; i <= n; i++)                 //outer loop to handle rows
            {
                for (j = i; j < n; j++)          //inner loop to print spaces
                    {
                      System.out.print(" ");
                    }
                for (k = 1; k <= (2 * i - 1); k++)
                {
                if (k == 1 || i == n || k == (2 * i - 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        printPattern(n);
    }
}




































