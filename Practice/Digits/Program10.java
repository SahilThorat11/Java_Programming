import java.util.Scanner;

class Digits
{
    public int ProductDigits(int iNo)
    {
        int iDigit = 0;
        int iProd = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            return 0;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iProd = iProd * iDigit;
            iNo = iNo / 10;
        }

        return iProd;
    }
}

class Program10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.ProductDigits(iNo);

        System.out.println("Product of digits is: " + iRet);

        sobj.close();
    }
}