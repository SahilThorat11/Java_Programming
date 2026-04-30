import java.util.Scanner;

class Digits
{
    public int MinDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        // Special case for 0
        if(iNo == 0)
        {
            return 0;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;
        }

        return iMin;
    }
}

class Program07
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.MinDigit(iNo);

        System.out.println("Smallest digit from given number is : " + iRet);

        sobj.close();
    }
}