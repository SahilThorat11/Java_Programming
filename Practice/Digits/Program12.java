import java.util.Scanner;

class Digits
{
    public int FirstRepeatingDigit(int iNo)
    {
        int freq[] = new int[10];

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Step 1: Count frequency
        int temp = iNo;
        while(temp > 0)
        {
            int digit = temp % 10;
            freq[digit]++;
            temp = temp / 10;
        }

        // Step 2: Check from left to right
        // Reverse number to maintain order
        int rev = 0;
        while(iNo > 0)
        {
            int digit = iNo % 10;
            rev = rev * 10 + digit;
            iNo = iNo / 10;
        }

        while(rev > 0)
        {
            int digit = rev % 10;

            if(freq[digit] > 1)
            {
                return digit;
            }

            rev = rev / 10;
        }

        return -1; // no repeating digit
    }
}

class Program12
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.FirstRepeatingDigit(iNo);

        if(iRet == -1)
        {
            System.out.println("No repeating digit found.");
        }
        else
        {
            System.out.println("First repeating digit is: " + iRet);
        }

        sobj.close();
    }
}