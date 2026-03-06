import java.util.*;

class Program10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iNo = 0, iCount = 0, iDigit = 0, iTemp = 0, iPow = 0, iSum = 0, iCountTemp = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();
        
        iTemp = iNo;

        // Count number of digits
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        iCountTemp = iCount;

        // Count Power

        // y = iCount
        // x = iDigit

        while(iNo != 0)
        {
            iPow = 1;
            iDigit = iNo % 10;

                // Count power
                while(iCount != 0)
                {
                    iPow = iPow * iDigit;
                    iCount--;
                }

                iCount = iCountTemp;
                iSum = iSum + iPow;

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println(iTemp + " is a ArmStrong number.");
        }
        else
        {
            System.out.println(iTemp + " is Not -a ArmStrong number.");
        }

        sobj.close();
    }
}