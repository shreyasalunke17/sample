package TASKPROGRAMS;
public class ODDforloop
{
    public static void main(String[] args)
    {
        int start=100;
        int end=200;
        System.out.println("Odd Numbers Between 100 And 200:");
        for(int i=start;i<=end;i++)
        {
            if (i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}


