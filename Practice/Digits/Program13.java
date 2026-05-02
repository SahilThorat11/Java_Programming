import java.util.Scanner;

class Digits
{
    public int CountGreaterThanAverage(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int temp = iNo;

        // Step 1: Calculate sum and count
        while(temp > 0)
        {
            iDigit = temp % 10;
            iSum = iSum + iDigit;
            iCount++;
            temp = temp / 10;
        }

        if(iCount == 0) return 0; // for input 0

        double avg = (double)iSum / iCount;

        // Step 2: Count digits greater than average
        int iGreaterCount = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit > avg)
            {
                iGreaterCount++;
            }

            iNo = iNo / 10;
        }

        return iGreaterCount;
    }
}

class Program13
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountGreaterThanAverage(iNo);

        System.out.println("Count of digits greater than average: " + iRet);

        sobj.close();
    }
}