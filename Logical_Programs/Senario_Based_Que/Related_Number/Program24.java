import java.util.*;

class Program24
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        int iNo = 0, iCube = 0, iTemp = 0, iCount = 0, iDeno = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDeno = (int)Math.pow(10, iCount);

        if(iCube % iDeno == iTemp)
        {
            System.out.println(iTemp + " is Trimorphic number");
        }
        else
        {
            System.out.println(iTemp + " is Not a Trimorphic number");
        }

        sobj.close();
    }
}