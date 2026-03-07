import java.util.*;

class Program16
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iNo = 0, iTemp = 0, iDigit = 0, iRev = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        System.out.println(iRev);

        sobj.close();
    }
}