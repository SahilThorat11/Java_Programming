
import java.util.Scanner;

class ReverseUtil
{
    public static String reverse(String str)
    {
        StringBuilder sbobj = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) 
        {
            sbobj.append(str.charAt(i));
        }

        return sbobj.toString();
    }
}

class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sobj.nextLine();

        String revstring = ReverseUtil.reverse(input);

        System.out.println("Reversed String: " + revstring);

        sobj.close();
    }
}