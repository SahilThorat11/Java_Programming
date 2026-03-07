import java.util.*;

class Program19
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iNo = 0, iSquare = 0, iTemp = 0, iCount = 0, iDeno = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDeno = (int)Math.pow(10, iCount);

        if(iSquare % iDeno == iTemp)
        {
            System.out.println(iTemp + " is Automorphic number");
        }
        else
        {
            System.out.println(iTemp + " is Not a Automorphic number");
        }

        sobj.close();
    }
}