import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Display
//  Description    : Contains method to print symbol in reverse order
//  Author         : Sahil Rajaram Thorat
//  Date           : 07/12/2025
//
////////////////////////////////////////////////////////////////////////////////

class Demo
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : Display
    //  Description   : Use to print 1 to 5 in reverse order.
    //  Input         :  
    //  Output        : void
    //
    ////////////////////////////////////////////////////////////////////////////

    void Display(int iNo)
    {
        int iCnt = 0;

        // Updater
        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iCnt < iNo)
        {
            System.out.println("*\t");
            iCnt++;
        }
    } // End of Accept
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Program1_3
//  Description    : Entry point for the application
//  Author         : Sahil Rajaram Thorat
//  Date           : 17/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class program2_1
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point function which takes input from user
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.Display(iValue);
    } // End of main
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 5               Input  : 2
//  Output : *               Output : *
//           *                        *
//           *
//           *
//           *
//
////////////////////////////////////////////////////////////////////////////////
