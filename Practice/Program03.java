import java.util.*;

class Solution 
{
    public int SubStringLength(String str) 
    {
        int lastIndex[] = new int[256];
        
        // Initialize all values to -1
        Arrays.fill(lastIndex, -1);
        
        int left = 0;
        int maxLength = 0;
        
        for(int right = 0; right < str.length(); right++)
        {
            char ch = str.charAt(right);
            
            // If character already seen, move left pointer
            if(lastIndex[ch] >= left) 
            {
                left = lastIndex[ch] + 1;
            }
            
            // Update last seen index
            lastIndex[ch] = right;
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

public class Program03 {
    
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sobj.nextLine();
        
        Solution slobj = new Solution();
        int result = slobj.SubStringLength(input);
        
        System.out.println("Length of longest substring without repeating characters: " + result);
        
        sobj.close();
    }
}