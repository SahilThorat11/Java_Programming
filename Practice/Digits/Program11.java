import java.util.Scanner;

class Digits
{
    public void CountEvenOdd(int iNo)
    {
        int iDigit = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }

            iNo = iNo / 10;
        }

        System.out.println("Even digits count : " + iEvenCount);
        System.out.println("Odd digits count : " + iOddCount);
    }
}

class Program11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        dobj.CountEvenOdd(iNo);

        sobj.close();
    }
}