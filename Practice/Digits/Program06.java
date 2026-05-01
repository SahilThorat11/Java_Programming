import java.util.Scanner;

class Digits
{
    public int MaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
        }

        return iMax;
    }
}

class Program06
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.MaxDigit(iNo);

        System.out.println("Largest digit is : " + iRet);

        sobj.close();
    }
}