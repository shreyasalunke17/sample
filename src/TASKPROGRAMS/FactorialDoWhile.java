package TASKPROGRAMS;
public class FactorialDoWhile
{
    public static void main(String[] args)
    {
        int factorial=1,number=6;
        int i=1;
        do
        {
            factorial=factorial*i;
            i++;
        }
        while(i<=number);
        System.out.println("Factorial of "+number+" = "+factorial);
    }

}
