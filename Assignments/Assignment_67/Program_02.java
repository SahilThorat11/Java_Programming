import java.util.Scanner;

class Program_02
{
    public static void main(String A[])
    {
        int iNo1 = 0, iNo2 = 0, iCount = 0, iMask = 0x00000001, iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the first Number  : ");
        iNo1 = sobj.nextInt();

        System.out.print("Enter the second Number  : ");
        iNo2 = sobj.nextInt();

        System.out.print("Positions of common 1 bits: ");
        
        iPos = 1;

        while(iNo1 != 0 || iNo2 != 0)
        {
            if(((iNo1 & iMask) != 0) && ((iNo2 & iMask) != 0))
            {
                System.out.print(iPos + " ");
                iCount++;
            }

            iNo1 = iNo1 >> 1;
            iNo2 = iNo2 >> 1;

            iPos++; 
        }
    }
}
