import java.util.*;

class Program23
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iDigit = 0, iTemp = 0, iSum = 0, iCount = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + ((int)Math.pow(iDigit, iCount));
            iCount--;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println(iTemp + " is a Disarium number");
        }
        else
        {
            System.out.println(iTemp + " is not a Dissarium number");
        }

        sobj.close();
    }
}