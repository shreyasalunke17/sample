package DecisionMaking;
public class ifelseProg4
{
    public static void main(String[] args) {

        int number=-10;
        if (number > 0)  //checks if number is greater than 0
        {
            System.out.println("The Number is Positive");
        }
        else if (number < 0)  //checks if number is less than 0
            {
            System.out.println("The Number is Negative");
        }
        //if both condition is false
        else
        {
            System.out.println("The Number is 0");
        }
    }
}
