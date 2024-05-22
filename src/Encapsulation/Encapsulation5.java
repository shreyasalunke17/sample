package Encapsulation;
class StudentMarks
{
    private String name;
    private int Java;
    private int Networking;
    private int Webframeworks;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setJava(int Java)
    {
        this.Java=Java;
    }
    public void setNetworking(int Networking)
    {
        this.Networking=Networking;
    }
    public void setWebframeworks(int Webframeworks)
    {
        this.Webframeworks=Webframeworks;
    }
    void marksRead()
    {
        System.out.println("Student's Name: "+name);
        System.out.println("Marks in Java: "+Java);
        System.out.println("Marks in Computer Networking: "+Networking);
        System.out.println("Marks in Web Frameworks: "+Webframeworks);
        int Totalmarks=Java+Networking+Webframeworks;
        int percentage=(Totalmarks*100)/300;
        System.out.println("Percentage: "+percentage);
    }
}
public class Encapsulation5
{
    public static void main(String[] args)
    {
        StudentMarks obj=new StudentMarks();
        obj.setName("Shreya Salunke");
        obj.setJava(85);
        obj.setNetworking(75);
        obj.setWebframeworks(80);
        obj.marksRead();
    }
}