package Inheritance.HybridInheritance;
class GrandFather
{
    public void showG()
    {
        System.out.println("He is GrandFather");
    }
}
class Father extends GrandFather
{
    public void showF()
    {
        System.out.println("He is Father");
    }
}
class Son extends Father
{
    public void showS()
    {
        System.out.println("He is Son");
    }
}
class Daughter extends Father
{
    public void showD()
    {
        System.out.println("She is Daughter");
    }
}
public class HybridInh
{
    public static void main(String[] args)
    {
       Son obj = new Son();
       obj.showG();
       obj.showF();
       obj.showS();
       Daughter obj1 = new Daughter();
       obj1.showG();
       obj1.showF();
       obj1.showD();
    }
}











