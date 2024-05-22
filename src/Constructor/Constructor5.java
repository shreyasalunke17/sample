package Constructor;
class Rectangle
{
    int length;
    int breadth;
    Rectangle()  //declaring constructor to initialize lenght and breadth
    {
        length=5;
        breadth=10;
    }
    int area() //declaring method
    {
        int rectArea=length*breadth;
        return rectArea;
    }
}
public class Constructor5
{
    public static void main(String args[])
    {
        Rectangle obj=new Rectangle();
        System.out.println("Area of Rectangle="+obj.area());
    }
}