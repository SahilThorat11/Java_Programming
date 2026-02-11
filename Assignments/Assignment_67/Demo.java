import java.util.Scanner;

class Program_02
{
    public static void main(String A[])
    {
        int iNo1 = 0, iNo2 = 0, iCount = 0, iMask = 0x00000001;
        int iPos = 1; // Bit positions start from 1 (LSB)

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the first Number  : ");
        iNo1 = sobj.nextInt();

        System.out.print("Enter the second Number  : ");
        iNo2 = sobj.nextInt();

        System.out.print("Positions of common 1 bits: ");

        while(iNo1 != 0 || iNo2 != 0)
        {
            // Check if both have 1 in the current bit
            if((iNo1 & iMask) != 0 && (iNo2 & iMask) != 0)
            {
                System.out.print(iPos + " ");
                iCount++;
            }

            // Shift both numbers to the right by 1
            iNo1 = iNo1 >> 1;
            iNo2 = iNo2 >> 1;

            iPos++; // Move to next bit position
        }

        System.out.println();
        System.out.println("Number of common 1's in both numbers: " + iCount);
    }
}
