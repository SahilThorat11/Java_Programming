import java.util.Scanner;

// Utility class
class AnagramUtil
{

    public static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length()) return false;

        int[] freq = new int[26];

        for (char c : a.toCharArray())
        {
            freq[c - 'a']++;
        }

        for (char c : b.toCharArray())
        {
            freq[c - 'a']--;
        }

        for (int f : freq)
        {
            if (f != 0) return false;
        }

        return true;
    }
}

class Program04
{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sobj.nextLine();

        boolean result = AnagramUtil.isAnagram(str1, str2);

        if(result) 
        {
            System.out.println("The strings are anagrams.");
        } 
        else 
        {
            System.out.println("The strings are NOT anagrams.");
        }

        sobj.close();
    }
}