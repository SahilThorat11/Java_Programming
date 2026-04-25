import java.util.Scanner;

class Program06
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

        System.out.println("Reversed String is : " + rev);

        sobj.close();
    }
}