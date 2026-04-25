import java.util.Scanner;

class Program08
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        int iStart = 0;
        int iEnd = str.length() - 1;
        boolean bRet = true;

        while(iStart < iEnd)
        {
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                bRet = false;
                break;
            }

            iStart++;
            iEnd--;
        }

        if(bRet == true)
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