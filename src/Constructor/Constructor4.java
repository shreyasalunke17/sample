package Constructor;
public class Constructor4
{
    public Constructor4()
    {
        System.out.println("This is Default Constructor");
    }
    public Constructor4(String name, int marks)
    {
        System.out.println("This is Parameterized Constructor "+name+" and Marks="+marks);
    }
    public static void main(String[] args)
    {
        Constructor4 obj=new Constructor4(); //will call default constructor
        Constructor4 obj1=new Constructor4("Java",100); //will call parameterized constructor
    }
}
