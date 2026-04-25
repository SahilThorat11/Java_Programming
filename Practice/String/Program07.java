import java.util.Scanner;

class Program07
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is NOT palindrome");
        }

        sobj.close();
    }
}