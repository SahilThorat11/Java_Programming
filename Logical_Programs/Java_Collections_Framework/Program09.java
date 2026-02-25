import java.util.concurrent.*;

class Program09
{
    public static void main(String A[])
    {
        ConcurrentHashMap<Integer ,String> map = new ConcurrentHashMap<> ();

        map.put(1, "Marvellous");
        map.putIfAbsent(2, "Infosystems");

        System.out.println(map);
    }
}