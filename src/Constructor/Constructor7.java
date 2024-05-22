package Constructor;
class Rectangle1
{
    int length;
    int breadth;
    Rectangle1(int l,int b) //constructor to initialize length and breadth of rectangle
    {
        length=l;
        breadth=b;
    }
    int area() //method
    {
        return (length*breadth);
    }
}
public class Constructor7
{
    public static void main(String[] args)
    {
        Rectangle1 obj1=new Rectangle1(5,6);
        Rectangle1 obj2=new Rectangle1(10,8);
        System.out.println("Area of first rectangle="+obj1.area());
        System.out.println("Area of second rectangle="+obj2.area());
    }
}
