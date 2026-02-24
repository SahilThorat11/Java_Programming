import java.util.*;

class Program02
{
    public static void main(String A[])
    {
        LinkedList<String> list = new LinkedList<> ();

        list.add("Marvellous");
        list.add("Ganesh");
        list.add("Saraswati");

        System.out.println(list);
        list.removeFirst();
        System.out.println("After removel : " + list);
    }
}