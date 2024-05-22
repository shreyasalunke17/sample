package Overloading;
public class MethodOverloading6
{
    public void Demo1(int a,int b)
    {
        System.out.println("Integer Parameters");
    }
    public int Demo1(int a,String b)
    {
        System.out.println("Integer and String parameter");
        return 1;
    }
    public int Demo1(int a,String b,boolean c)
    {
        System.out.println("Multiple parameter");
        return 1;
    }
    public static void main(String[] args)
    {
        MethodOverloading6 obj=new MethodOverloading6();
        obj.Demo1(6,8);
        obj.Demo1(5,"Overloading",true);
        System.out.println("Method Overloading");
    }
}

