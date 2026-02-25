import java.util.*;

class Program07
{
    public static void main(String A[])
    {
        ArrayDeque<String> dq = new ArrayDeque<> ();

        dq.push("Marvellous");
        dq.push("Infosystems");

        System.out.println("Stack style : " + dq);

        dq.pop();

        System.out.println("After pop : " + dq);
    }
}