import java.util.*;

class Program06
{

    public static boolean CheckStrong(int iNo)
    {
        int iTemp = 0, iSum = 0, iDigit = 0;

        iTemp = iNo;

        //                0   1  2  3   4   5    6     7     8      9
        int iFactArr[] = {1 , 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iSum = iSum + iFactArr[iDigit]; 

            iNo = iNo / 10;
        }

        return (iSum == iTemp);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        bRet = CheckStrong(iValue);

        if(bRet)
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