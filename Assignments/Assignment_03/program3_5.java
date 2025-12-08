import java.util.Scanner;

class Arithematic
{
    boolean CheckVowel(char ch)
    {
        if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
           (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}

class program3_5
{
    public static void main(String A[])
    {
        char cValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the Character : ");
        cValue = sobj.next().charAt(0);

        Arithematic aobj = new Arithematic();

        bRet =aobj.CheckVowel(cValue);

        if(bRet == true)
        {
            System.out.println("It is Vowel");
        }
        else
        {
            System.out.println("It is Not Vowel");
        }
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