package DecisionMaking;
public class jump
{
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            if (i % 2==0)            // If the number is even skip and continue
                continue;
            System.out.print(i+" "); // If number is odd, print it

        }
    }
}
/*
6)jump: Java supports three jump statements: break, continue and return. These three statements transfer control to
 another part of the program.

Break: In Java, a break is majorly used for:
Terminate a sequence in a switch statement (discussed above).
To exit a loop.
Used as a “civilized” form of goto.

Continue: Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running the
loop but stop processing the remainder of the code in its body for this particular iteration. This is, in effect,
A goto just past the body of the loop, to the loop’s end. The continue statement performs such an action.

Time Complexity: O(1)
Auxiliary Space: O(1)
*/

















