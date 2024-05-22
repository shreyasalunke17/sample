package Encapsulation;
class Book
{
private String author;
private String title;
private int id;
public String getAuthor()
{
    return author;
}
public void setAuthor(String a)
{
    this.author=a;
}
public String getTitle()
{
    return title;
}
public void setTitle(String t)
{
    this.title=t;
}
public int getId()
{
    return id;
}
public void setId(int i)
{
    this.id=i;
}
}
public class Encapsulation2
{
    public static void main(String[] args)
    {
        Book Obj=new Book();
        Obj.setAuthor("James Gosling");
        Obj.setTitle("The Java Programming Language");
        Obj.setId(1057);
        System.out.println("Book Title: "+Obj.getTitle()+"\n"+"Book Author: "+Obj.getAuthor()+"\n"+"Book Id: "+Obj.getId());
    }
}
