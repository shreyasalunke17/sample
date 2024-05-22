package MethodCreation;
public class CreateMethod
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int subtract(int a,int b)
    {
        return a-b;
    }
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static double divide(int a,int b)
    {
        return (double) a/b;
    }
    public static void main(String[] args)
    {
        int resultAdd=add(5,3);
        System.out.println("Addition= "+resultAdd);

        int resultSubtract = subtract(10,4);
        System.out.println("Subtraction= "+resultSubtract);

        int resultMultiply = multiply(4,5);
        System.out.println("Multiplication= "+resultMultiply);

        double resultDivide = divide(20,5);
        System.out.println("Division= "+resultDivide);
    }
}

