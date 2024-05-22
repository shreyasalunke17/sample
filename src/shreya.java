class huda
{
    void demo (){
        System.out.println("this is parent class ");
    }
}
public class shreya extends huda
{
    void demo ()
    {
        System.out.println("this is child class ");
    }
    public static void main(int[] args) // We can write Multiple main method in different ways
    {
    }
    public static void main(String[] args) {
      /* huda h = new huda();
       h.demo();
       shreya s = new shreya();
       s.demo();*/

       huda a=new shreya(); //Upcasting
       a.demo();

       shreya b = (shreya)new huda();
       b.demo();
    }
}




