import java.util.Scanner;

class Program_01
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0x00000001, iResult = 0, iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        System.out.print("Enter the Position  : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("bit is ON");
        }
        else
        {
            System.out.println("bit is OFF");
        }
    }
}
