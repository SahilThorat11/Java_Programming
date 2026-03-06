import java.util.*;

class Program04
{

    public static boolean CheckStrong(int iNo)
    {
        int iFact = 0, i = 0, iTemp = 0, iSum = 0, iDigit = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            // Logic
            for(iFact = 1, i = 1; i <= iDigit; i++)
            {
                iFact = iFact * i;
            }
            
            iSum = iSum + iFact;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        bRet = CheckStrong(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is a Strong number");
        }
        else
        {
            System.out.println(iValue + " is Not a Strong number");
        }

        sobj.close();
    }
}