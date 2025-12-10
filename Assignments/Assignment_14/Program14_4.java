import java.util.Scanner;

class Arithmetic
{
    int countFour(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 4)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program14_4
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countFour(iValue);
        
        System.out.println("Frequency of Four is : " + iRet);
    
    }
}