import java.util.Scanner;

class Arithematic
{
    void PrintEven(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt * 2 + "\t");
        }
    }
}

class program3_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.PrintEven(iValue);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : 7
//  Output : 2       4       6       8       10      12      14
//
// Input  : 9
// Output : 2       4       6       8       10      12      14      16      18
//
////////////////////////////////////////////////////////////////////////////////