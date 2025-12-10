import java.util.Scanner;

class Arithmetic
{
    int multDigits(int iNo)
    {
        int iDigit = 0, iMul = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }
            
            iMul = iMul * iDigit;
            iNo = iNo / 10;
        }

        return iMul;
    }
}

class Program15_4
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.multDigits(iValue);
        
        System.out.println("Multiplication of all digits are : " + iRet);
    }
}