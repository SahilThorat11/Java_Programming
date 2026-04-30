
import java.util.Scanner;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCount++;
        }

        return iCount;
    }
}

class Program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigits(iNo);

        System.out.println("Number of digits from given number are : " + iRet);

        sobj.close();
    }
}