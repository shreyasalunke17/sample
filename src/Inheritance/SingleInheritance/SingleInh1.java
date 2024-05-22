package Inheritance.SingleInheritance;
class One
    {
        public void print()
        {
            System.out.println("Single Level");
        }
    }
    class Two extends One
    {
        public void display()
        {
            System.out.println("Inheritance");
        }
    }
      public class SingleInh1
      {
          public static void main(String[] args)
          {
              Two obj = new Two();
              obj.print();
              obj.display();
          }
      }





