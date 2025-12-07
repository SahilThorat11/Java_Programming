////////////////////////////////////////////////////////////////////////////////
//
//  Required package
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Arithematic
//  Description    : Check whether number is completly divisible by 5 or not
//  Author         : Sahil Rajaram Thorat
//  Date           : 17/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class Arithematic
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : Check
    //  Description   : use to check number is completly divisible by 5 or not.
    //  Input         : Integer (iNo)
    //  Output        : boolean
    //
    ////////////////////////////////////////////////////////////////////////////

    boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }

    } // End of Divide
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : Program1_4
//  Description    : Entry point for the application
//  Author         : Sahil Rajaram Thorat
//  Date           : 17/10/2025
//
////////////////////////////////////////////////////////////////////////////////

class program1_4
{
    ////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point function which performs integer division
    //
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = true;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();  

        bRet = aobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisible by 5");
        }

    } // End of main
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 15
//  Output : divisible by 5
//
////////////////////////////////////////////////////////////////////////////////
