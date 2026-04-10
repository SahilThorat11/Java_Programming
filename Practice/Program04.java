import java.util.*;

class Solution
{    
    public int SubStringLength(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < str.length(); right++) 
        {
            char ch = str.charAt(right);
            
            if (map.containsKey(ch))
            {
                left = Math.max(left, map.get(ch) + 1);
            }
            
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

public class Program04 
{    
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sobj.nextLine();
        
        Solution slobj = new Solution();
        int result = slobj.SubStringLength(input);
        
        System.out.println("Length of longest substring without repeating characters: " + result);
        
        sobj.close();
    }
}