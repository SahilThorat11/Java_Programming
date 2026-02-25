import java.util.*;

class Program06
{
    public static void main(String A[])
    {
        TreeMap<Integer, String> map = new TreeMap<> ();

        map.put(2, "Marvellous");
        map.put(1, "Infosystems");
        System.out.println("Sorted Map : " + map);
        System.out.println("First Key : " + map.firstKey());
    }
}