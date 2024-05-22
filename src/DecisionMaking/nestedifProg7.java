package DecisionMaking;
public class nestedifProg7
{
    public static void main(String[] args)
    {
        String category = "Clothing";     //Product category Clothing,Electronics,Food
        double purchaseAmount = 6000.0;   //Purchase amount in Rs.

        if ("Electronics".equals(category))
        {
            System.out.println("Discount: 10%");
        }
        else if ("Clothing".equals(category))
        {
            if (purchaseAmount  >  5000)
            {
                System.out.println("Discount: 20%");
            }
            else
            {
                System.out.println("Discount: 15%");
            }
        }
        else if ("Food".equals(category))
        {
            if (purchaseAmount  >  1000)
            {
                System.out.println("Discount: 5%");
            }
            else
            {
                System.out.println("No Discount");
            }
        }
        else
        {
            System.out.println("No Discount");
        }
    }
}


/*
Problem Statement: Calculate the discount on a product based on its category in a store
The discount rules are:
Electronics: 10% discount
Clothing: 15% discount, but 20% if the purchase amount is over Rs. 5000
Food: No discount, unless the purchase amount is over Rs. 1000, then 5% discount
*/










