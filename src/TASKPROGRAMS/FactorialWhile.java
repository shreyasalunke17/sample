package TASKPROGRAMS;
public class FactorialWhile
{
    public static void main(String[] args)
    {
        int number=4,factorial=1;
        int i = 1;
        while(i<=number)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial of "+number+"="+factorial);
    }
}





















