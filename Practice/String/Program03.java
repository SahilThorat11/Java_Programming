
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Utility class
class Duplicate
{
    public static void findDuplicates(String str) 
    {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) 
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean found = false;

        for(Map.Entry<Character, Integer> e : map.entrySet()) 
        {
            if (e.getValue() > 1)
            {
                System.out.println(e.getKey() + " -> " + e.getValue());
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("No duplicate characters found.");
        }
    }
}

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sobj.nextLine();

        Duplicate.findDuplicates(input);

        sobj.close();
    }
}