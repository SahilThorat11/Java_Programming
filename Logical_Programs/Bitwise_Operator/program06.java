import java.util.Scanner;

class program620
{
    public static void main(String A[])
    {
        int No = 0;
        int iDigit = 0;
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        No = sobj.nextInt();

        while(No != 0)
        {
            iDigit = No % 2;
            System.out.print(iDigit);
            if(iDigit == 1)
            {
                iCount++;
            }
            No = No / 2;
        }
        System.out.println();
        System.out.println("Number of 1's are : " + iCount);
    }
}