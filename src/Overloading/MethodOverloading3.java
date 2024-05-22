package Overloading;
class Sum
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    }
    public class MethodOverloading3
    {
    public static void main(String[] args)
    {
        System.out.println("Addition Of Integers="+Sum.add(5,17));
        System.out.println("Addition Of Float Numbers="+Sum.add(2.5,5.4));
    }
}
