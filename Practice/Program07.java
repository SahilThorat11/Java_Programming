import java.util.*;

class Solution
{
    public boolean isAnagram(String str1, String str2)
    {
        if (str1 == null || str2 == null)
        {
            return false;
        }
        
        if (str1.length() != str2.length())
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray())
        {
            if(!map.containsKey(ch)) 
            {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) < 0)
            {
                return false;
            }
        }

        return true;
    }
}

public class Program07
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sobj.nextLine();

        Solution slobj = new Solution();
        boolean result = slobj.isAnagram(str1, str2);

        if (result)
        {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        }
        else
        {
            System.out.println(str1 + " and " + str2 + " are not Anagrams.");
        }

        sobj.close();
    }
}


/* 
------------------------------ How It Works------------------------------

str1 = "anagram"   str2 = "nagaram"

Step 1 — Build map from str1:
  {a:3, n:1, g:1, r:1, m:1}

Step 2 — Decrement map using str2:
  n -> {a:3, n:0, g:1, r:1, m:1}
  a -> {a:2, n:0, g:1, r:1, m:1}
  g -> {a:2, n:0, g:0, r:1, m:1}
  a -> {a:1, n:0, g:0, r:1, m:1}
  r -> {a:1, n:0, g:0, r:0, m:1}
  a -> {a:0, n:0, g:0, r:0, m:1}
  m -> {a:0, n:0, g:0, r:0, m:0}

No negatives found ->  Anagram!

-------------------------------------------------------------------------
*/