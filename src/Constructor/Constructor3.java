package Constructor;
class Demo
{
    int a;
    boolean b;
    public static void main(String[] args)
    {
        Demo obj = new Demo(); //In this case,default constructor is called
        System.out.println("Default Value:");
        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
    }
}