import java.util.Scanner;

class Digits
{
    public int FindMissingDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;
        int iMax = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int temp = iNo;

        // Step 1: Find min, max, sum
        while(temp > 0)
        {
            iDigit = temp % 10;

            if(iDigit < iMin) iMin = iDigit;
            if(iDigit > iMax) iMax = iDigit;

            iSum += iDigit;

            temp = temp / 10;
        }

        // Step 2: Expected sum from min to max
        int expectedSum = 0;
        for(int i = iMin; i <= iMax; i++)
        {
            expectedSum += i;
        }

        // Step 3: Missing digit
        return expectedSum - iSum;
    }
}

class Program14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.FindMissingDigit(iNo);

        if(iRet == 0)
        {
            System.out.println("No digit missing.");
        }
        else
        {
            System.out.println("Missing digit is : " + iRet);
        }

        sobj.close();
    }
}