package Overloading;
public class MethodOverloading1
{
    public void Demo(int a,int b)
    {
        System.out.println("Integer Parameters");
    }
    public int Demo(String a,int b)
    {
        System.out.println("Name,Value");
        return 1;
    }
    private int Demo(int n)
    {
        System.out.println("1 integer parameter");
        return 1;
    }
    public static void main(String[] args)
    {
        MethodOverloading1 obj=new MethodOverloading1();
        obj.Demo("Shreya",23);
        System.out.println("Method Overloading");
    }
}
