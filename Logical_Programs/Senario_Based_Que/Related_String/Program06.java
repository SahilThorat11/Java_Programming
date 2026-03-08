import java.util.*;

class Program06
{
    public static void main(String A[])
    {
        String str = "    hello    world    ";

        System.out.println(str);
        str = str.trim();

        str = str.replaceAll("l", "L");

        System.out.println(str);
    }
}
