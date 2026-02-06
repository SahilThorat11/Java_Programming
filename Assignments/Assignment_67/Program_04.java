import java.util.Scanner;

class Program_04
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0x00000001, iPos1 = 0, iPos2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        System.out.print("Enter first position  : ");
        iPos1 = sobj.nextInt();

        System.out.print("Enter Second position  : ");
        iPos2 = sobj.nextInt();

        int imaskPos1 = iMask << (iPos1 - 1);   
        int imaskPos2 = iMask << (iPos2 - 1); 

        if ((iNo & imaskPos1) != 0)
        {
            System.out.println(iPos1 + "th bit is ON");
        }
        else
        {
            System.out.println(iPos1 + "th bit is OFF");
        }

        if ((iNo & imaskPos2) != 0)
        {
            System.out.println(iPos2 + "th bit is ON");
        }
        else
        {
            System.out.println(iPos2 + "th bit is OFF");
        }
    }
}
