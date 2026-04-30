
import java.util.Scanner;

class Digits
{
    public int SumDigits(int iNo)
    {
        if(iNo == 0)
        {
            return 1;
        }
        
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
        }

        return iSum;
    }
}

class Program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.SumDigits(iNo);

        System.out.println("Sum of digits from given number are : " + iRet);

        sobj.close();
    }
}