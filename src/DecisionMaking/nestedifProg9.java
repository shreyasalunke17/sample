package DecisionMaking;
import java.io.*;
public class nestedifProg9
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Exam Marks = ");
        int m=Integer.parseInt(br.readLine());
        if(m<50)
        {
            System.out.println("The student has Failed");
        }
        else if(m>=50 && m<60)
        {
            System.out.println("The student has got D Grade");
        }
        else if(m>=60 && m<70)
        {
            System.out.println("The student has got C Grade");
        }
        else if(m>=70 && m<80)
        {
            System.out.println("The student has got B Grade");
        }
        else if(m>=80 && m<90)
        {
            System.out.println("The student has got A Grade");
        }
        else if(m>=90 && m<100)
        {
            System.out.println("The student has got A+ Grade");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}
