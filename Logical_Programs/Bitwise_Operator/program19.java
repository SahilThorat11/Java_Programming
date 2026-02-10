import java.util.Scanner;

class program633
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0x00000001, iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        System.out.print("Enter the Position  : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println(iPos + "th bit is ON");
        }
        else
        {
            System.out.println(iPos + "th bit is OFF");
        }
    }
}
