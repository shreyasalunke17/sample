package Overloading;
public class MethodOverloading7
{
    public void StudentName(String name, int id)
    {
        System.out.println("StudentName:"+name+" "+"Id="+id);
    }
    public void StudentName(int id, String name)
    {
        System.out.println("StudentName:"+name+" "+"Id="+id);
    }
}
class Student
{
    public static void main(String[] args)
    {
        MethodOverloading7 obj=new MethodOverloading7();
        obj.StudentName("Mansi",1);
        obj.StudentName(2,"Shreya");
        System.out.println("Method Overloading");
    }
}