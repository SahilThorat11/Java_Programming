import java.util.Scanner;

class Digits
{
    public int SecondMaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = -1;
        int iSecondMax = -1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iSecondMax = iMax;
                iMax = iDigit;
            }
            else if(iDigit > iSecondMax && iDigit != iMax)
            {
                iSecondMax = iDigit;
            }

            iNo = iNo / 10;
        }

        return iSecondMax;
    }
}

class Program08
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.SecondMaxDigit(iNo);

        if(iRet == -1)
        {
            System.out.println("Second largest digit not found.");
        }
        else
        {
            System.out.println("Second largest digit is : " + iRet);
        }

        sobj.close();
    }
}