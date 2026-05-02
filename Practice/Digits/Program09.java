import java.util.Scanner;

class Digits
{
    public int SecondMinDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 10;          // max possible digit is 9
        int iSecondMin = 10;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iSecondMin = iMin;
                iMin = iDigit;
            }
            else if(iDigit < iSecondMin && iDigit > iMin)
            {
                iSecondMin = iDigit;
            }

            iNo = iNo / 10;
        }

        if(iSecondMin == 10)
        {
            return -1;   // not found
        }

        return iSecondMin;
    }
}

class Program09
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.SecondMinDigit(iNo);

        if(iRet == -1)
        {
            System.out.println("Second smallest digit not found.");
        }
        else
        {
            System.out.println("Second smallest digit is: " + iRet);
        }

        sobj.close();
    }
}