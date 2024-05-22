package Overriding.b;
public class shape extends Overriding.a.shape
{
    public int show()
    {
        System.out.println("This is a child class of package b");
        return 1; //super.show();
    }
    protected int show(int a)
    {
        System.out.println("This is a parameter child class of package b");
        return super.show(a);
    }
    protected int show(int a,String c)
    {
        System.out.println("This is a double parameter child class pf package b");
        return super.show(a,"Hello");
    }
    public static void main(String[] args)
    {
        shape obj=new shape();
        obj.show(1);
        obj.show();
        obj.show(4,"Java");
    }
}
