import java.util.Scanner;

class Program_03
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0x00000001, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = iMask << (7 - 1);

        iResult = iNo ^ iMask; 

        System.out.println("Modified number is : " + iResult);
    }
}
