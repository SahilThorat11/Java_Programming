import java.util.*;

class Solution
{
    public String minWindowSubstring(String str1, String str2)
    {
        if(str1 == null || str2 == null || str1.length() < str2.length()) 
        {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : str2.toCharArray())
        {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < str1.length())
        {
            char ch = str1.charAt(right);

            // Expand window to the right
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // Check if current char satisfies a requirement
            if((need.containsKey(ch)) && (window.get(ch).equals(need.get(ch))))
            {
                matched++;
            }

            // Shrink window from left when all characters are matched
            while(matched == need.size())
            {
                // Update minimum window
                if (right - left + 1 < minLen)
                {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = str1.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar))
                {
                    matched--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE)
        {
            return "";
        }

        return str1.substring(minStart, minStart + minLen);
    }
}

class Program05
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source string: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter target string: ");
        String str2 = sobj.nextLine();

        Solution slobj = new Solution();
        String result = slobj.minWindowSubstring(str1, str2);

        if (result.isEmpty())
        {
            System.out.println("No valid window found.");
        }
        else
        {
            System.out.println("Minimum window substring: " + result);
        }

        sobj.close();
    }
}

/* 
------------------------------ How It Works------------------------------

str1 = "ADOBECODEBANC"   str2 = "ABC"

need   = {A:1, B:1, C:1}

-> Expand right until matched == need.size() (3)
  window hits "ADOBEC" -> matched = 3 

-> Shrink left while still matched:
  Remove 'A' -> matched = 2, stop

-> Continue expanding...
  window hits "ADOBECODEBA" -> matched = 3

-> Shrink left again -> best window = "BANC"

Output -> "BANC"

-------------------------------------------------------------------------
*/