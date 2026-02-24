import java.util.*;

class Program01
{
    public static void main(String A[])
    {
        ArrayList<String> list = new ArrayList<> ();

        list.add("Marvellous");
        list.add("Infosystems");
        list.add("Marvellous");

        System.out.println("List : " + list);
        System.out.println("First Element : " + list.get(0));
        System.out.println("Contains Marvellous ? " + list.contains("Marvellous"));

        list.remove("Infosystems");

        System.out.println("After removel : " + list);
    }
}