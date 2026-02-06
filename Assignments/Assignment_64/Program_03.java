import java.util.Scanner;

class Program_03
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = 0x08104040;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th, 15th, 21st and 28th bit is ON");
        }
        else
        {
            System.out.println("7th, 15th, 21st and 28th bit is OFF");
        }
    }
}