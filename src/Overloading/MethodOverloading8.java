package Overloading;
class MethodOverloading8
{
double figure(double l,double b)
{
    return (l*b);
}
double figure(double side)
{
    return (side*side);
}
public static void main(String[] args)
{
    MethodOverloading8 obj=new MethodOverloading8();
    System.out.println("Area of Rectangle="+obj.figure(2.4,4.2));
    System.out.println("Area of Square="+obj.figure(3.0));
}
}

