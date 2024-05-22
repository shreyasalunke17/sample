package Encapsulation;
class Piano
{
    private int keys;
    private String inventor;
    public int getkeys()
    {
        return keys;
    }
    public void setkeys(int keys)
    {
        this.keys=keys;
    }
    public String getinventor()
    {
        return inventor;
    }
    public void setinventor(String inventor)
    {
        this.inventor=inventor;
    }
}
public class Encapsulation6
{
    public static void main(String args[])
    {
        Piano obj=new Piano();
        obj.setinventor("Bartolomeo Cristofori");
        obj.setkeys(88);
        System.out.println("Invertor of Piano: "+obj.getinventor());
        System.out.println("Keys on Piano 52 White & 32 Black = "+obj.getkeys());
    }
}