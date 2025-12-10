import java.util.Scanner;

class Arithmetic
{
    int countLessThanSix(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < 6)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program14_5
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countLessThanSix(iValue);
        
        System.out.println("Frequency of numbers which is less than six are  : " + iRet);
    
    }
}