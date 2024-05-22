package Encapsulation;
class Rectangle
{
    private double length;
    private double width;
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
}
public class Encapsulation4
{
    public static void main(String[] args)
    {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(4.5);
        rectangle.setWidth(8.6);
        double length=rectangle.getLength();
        double width=rectangle.getWidth();
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
}
