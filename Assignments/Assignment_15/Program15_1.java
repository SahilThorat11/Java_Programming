import java.util.Scanner;

class Arithmetic
{
    int countEven(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program15_1
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countEven(iValue);
        
        System.out.println("Frequency of Even numbers are : " + iRet);
    }
}