import java.util.Scanner;

class Arithmetic
{
    int countTwo(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 2)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Program14_3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countTwo(iValue);
        
        System.out.println("Frequency of two is : " + iRet);
    
    }
}