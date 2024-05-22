 package Overloading;
public class MethodOverloading5
{
void details(String name,char grade,int rank)
{
    System.out.println("Student Name is: "+name);
    System.out.println("Student Grade: "+grade);
    System.out.println("Student Rank: "+rank);
}
void details(int rank,String name,char grade)
{
    System.out.println("Student Name is: "+name);
    System.out.println("Student Grade: "+grade);
    System.out.println("Student Rank: "+rank);
}
void details(String university)
{
    System.out.println("University Name: "+university);
}
}
class student1
{
    public static void main(String[] args)
    {
        MethodOverloading5 obj=new MethodOverloading5();
        System.out.println("Method Overloading");
        obj.details("Savitribai Phule Pune University");
        obj.details("Shreya Salunke",'A',1);
        obj.details("Sakshi Shendge",'B',2);
    }
}