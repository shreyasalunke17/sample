package ConstructorThisKeyword;
class PocketCaffe
{
    private int OrderNumber;
    private String PhoneNo;
    private String Beverages;
    private String Pizza;
    private String Sandwiches;
    public PocketCaffe()
    {
      //  this(1,"7568946578");
        System.out.println("1st constructor called!");

    }
  //  public PocketCaffe(int OrderNumber,String PhoneNo)
    {
        //this();
        System.out.println("2nd constructor called!");
    }
   public PocketCaffe(int OrderNumber,String PhoneNo,String Beverages,String Pizza,String Sandwiches)
    {
        this.OrderNumber=OrderNumber;
        this.PhoneNo=PhoneNo;
        this.Beverages=Beverages;
        this.Pizza=Pizza;
        this.Sandwiches=Sandwiches;
        System.out.println("3rd constructor called!");
    }
    public void pocketcaffeDetails()
    {
       System.out.println("Pocket Caffe Details:"+"\nOrder Number: "+this.OrderNumber +"\nPhone Number: " +this.PhoneNo+
                "\nBeverages" +this.Beverages+"\nPizza" +this.Pizza+ "\nSandwiches: " +this.Sandwiches+"\n\n");
    }
}
public class ConstructorThis6
{
public static void main(String[] args)
{
    PocketCaffe obj=new PocketCaffe(1,"6578945674","Cappuccino","Veg Exotica","Club Grilled");
    obj.pocketcaffeDetails();

}
}

