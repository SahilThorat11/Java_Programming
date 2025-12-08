import java.util.Scanner;

class Arithematic
{
    void Display(char cValue)
    {
        if(cValue >= 'A' && cValue <= 'Z')
        {
            cValue = (char) (cValue + 32);
            System.out.println(cValue);
        }
        else if(cValue >= 'a' && cValue <= 'z')
        {
            cValue = (char) (cValue - 32);
            System.out.println(cValue);
        }
    }
}

class program3_4
{
    public static void main(String A[])
    {
        char cValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the Character : ");
        cValue = sobj.next().charAt(0);

        Arithematic aobj = new Arithematic();

        aobj.Display(cValue);
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Testcases succesfully handle by the application
//
//  Input  : A
//  Output : a
//
// Input  : d
// Output : D   
//
////////////////////////////////////////////////////////////////////////////////