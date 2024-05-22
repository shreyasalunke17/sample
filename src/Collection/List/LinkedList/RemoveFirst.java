package Collection.List.LinkedList;
import java.util.LinkedList;
public class RemoveFirst
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("LinkedList: " + list);
        System.out.println("The remove first element: " + list.removeFirst());
        // Displaying the final list
        System.out.println("Final LinkedList:" + list);
    }
}






























