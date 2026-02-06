import java.util.Scanner;

class Program_02
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = 0x00020010;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("5th & 18th bit is ON");
        }
        else
        {
            System.out.println("5th & 18th bit is OFF");
        }
    }
}