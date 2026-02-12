import java.util.Scanner;

class CheckAlphabet 
{
    private char ch;

    public CheckAlphabet(char value) 
    {
        this.ch = value;
    }

    public boolean chkSmall() 
    {
        if ((ch >= 'a' && ch <= 'z')) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

class Program_04
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        CheckAlphabet cobj = new CheckAlphabet(cValue);

        bRet = cobj.chkSmall();

        if (bRet == true) 
        {
            System.out.println("It is Small Character");
        }
        else 
        {
            System.out.println("It is not a Small Character");
        }

        sobj.close();
    }
}
