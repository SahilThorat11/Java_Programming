import java.util.Scanner;

class Arithmetic
{
    int countRange(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > 3 && iDigit < 7)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program15_3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countRange(iValue);
        
        System.out.println("Frequency of numbers in between 3 and 7 are : " + iRet);
    }
}