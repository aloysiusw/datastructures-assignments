import java.util.*;
public class QueuedDemo
{
    Scanner scan;
    Queue<Integer> queue;
    int n;

    void insert()
    {
        scan = new Scanner(System.in);
        queue = new LinkedList<Integer>();

        System.out.println("Integer Queue - Insert & Delete");
        System.out.println("\n Enter 'n'value :");

        n = scan.nextInt();

        System.out.println("Enter the elements");

        for(int i=0; i<n; i++)
        {
            queue.add(scan.nextInt());
        }
    }
    void delete()
    {
        System.out.println("\nThe Queue");
        while(!queue.isEmpty())

        {
            System.out.println("\n The Queue");
            while(!queue.isEmpty())

            {
                System.out.println(queue.poll());
            }
        }
    }

    public static void main(String[]args)
    {
        QueuedDemo obj = new QueuedDemo();
        obj.insert();
        obj.delete();
    }
}
