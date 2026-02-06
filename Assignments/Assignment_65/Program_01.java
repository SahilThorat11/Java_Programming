import java.util.Scanner;

class Program_01
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = 0x00000040;
    
        iResult = iNo & (~iMask);

        System.out.println("Modified number is : " + iResult);
    }
}
