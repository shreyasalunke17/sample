package Overloading;
public class MethodOverloading2
{
    public int multiply(int a,int b)
    {
        System.out.println("Multiplication="+(a*b));
        return 1;
    }
    public int multiply(int a,int b,int c)
    {
        System.out.println("Multiplication of three values="+(a*b*c));
        return 1;
    }
    public static void main(String[] args)
    {
        MethodOverloading2 obj=new MethodOverloading2();
        obj.multiply(10,5);
        obj.multiply(7,8,9);
    }
}