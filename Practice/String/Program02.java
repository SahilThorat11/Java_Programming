
import java.util.Scanner;

class Palindrome
{
    public static boolean isPalindrome(String str) 
    {
        int l = 0, r = str.length() - 1;

        while (l < r)
        {
            if (str.charAt(l++) != str.charAt(r--)) 
            {
                return false;
            }
        }

        return true;
    }
}

public class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sobj.nextLine();

        boolean result = Palindrome.isPalindrome(input);

        if(result == true) 
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is NOT a palindrome.");
        }

        sobj.close();
    }
}