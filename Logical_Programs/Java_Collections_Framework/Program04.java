import java.util.*;

class Program04
{
    public static void main(String A[])
    {
        TreeSet<String> set = new TreeSet<>();

        set.add("Marvellous");
        set.add("PPA");
        set.add("LB");

        System.out.println("Sorted Set:" + set);
        System.out.println("First : " + set.first());
    }
}