import java.util.Scanner;

class CheckAlphabet 
{
    private char ch;

    public CheckAlphabet(char value) 
    {
        this.ch = value;
    }

    public boolean chkDigit() 
    {
        if ((ch >= '0' && ch <= '9')) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

class Program_03
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        CheckAlphabet cobj = new CheckAlphabet(cValue);

        bRet = cobj.chkDigit();

        if (bRet == true) 
        {
            System.out.println("Given character is digit");
        }
        else 
        {
            System.out.println("Given character is Not digit");
        }

        sobj.close();
    }
}
