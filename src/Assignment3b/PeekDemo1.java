import java.util.*;
public class PeekDemo1
{
    public static void main(String args[])
    {
        Stack st = new Stack();

        st.push("FORD");
        st.push("CHEVY");
        st.push("HONDA");

        //checking the top object
        System.out.println("Top object is: " + st.peek());
        System.out.println("Elements after peek: " + st);
    }
}