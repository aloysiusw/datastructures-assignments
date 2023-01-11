import java.util.LinkedList;
public class RemoveFirstLast
{
    public static void main (String[]args)
    {
        LinkedList<String> linkedlist2 = new LinkedList<String>();

        linkedlist2.add("1");
        linkedlist2.add("2");
        linkedlist2.add("3");
        linkedlist2.add("4");
        linkedlist2.add("5");

        System.out.println("LinkedList contains : " + linkedlist2);

        Object object = linkedlist2.removeFirst();
        System.out.println(object + " has been removed from the first index of LinkedList");
        System.out.println("LinkedList now contains : " + linkedlist2);

        object = linkedlist2.removeLast();
        System.out.println(object + " has been removed from the last index of LinkedList");

        System.out.println("LinkedList now contains : " + linkedlist2);
    }
}
