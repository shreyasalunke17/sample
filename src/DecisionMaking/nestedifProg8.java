package DecisionMaking;
import java.io.*;
public class nestedifProg8
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a Number = ");
        int n=Integer.parseInt(br.readLine());
        if(n>0)
        {
            System.out.println("The Number is POSITIVE");
        }
        else if(n<0)
        {
            System.out.println("The Number is NEGATIVE");
        }
        else
        {
            System.out.println("The Number is ZERO");
        }
    }
}