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

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + "\t"); 
            }   
        }
    }
}

class program3_2
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
//  Input  : 24
//  Output : 1       2       3       4       6       8       12      
//
// Input  : 28
// Output : 1       2       4       7       14     18
//
////////////////////////////////////////////////////////////////////////////////