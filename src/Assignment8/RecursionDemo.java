package Assignment8;

public class RecursionDemo
{
    public static int x = 0;

    static void p()
    {
        System.out.println("The next number is: " + x);
        x=x+1;
        p();
    }
    public static void main (String[]args)
    {
        p();
    }
}
