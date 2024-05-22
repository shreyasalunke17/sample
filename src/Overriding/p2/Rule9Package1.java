package Overriding.p2;
public class Rule9Package1 extends Overriding.p1.Rule9Package1
{
    public int display()
    {
        System.out.println("This is a child class");
        return super.display();
    }
    protected int display(int a)
    {
        System.out.println("This is a parameter child");
        return super.display(a);
    }
    public static void main(String[] args)
    {
        Rule9Package1 obj=new Rule9Package1();
        obj.display(1);
        obj.display();
    }
}