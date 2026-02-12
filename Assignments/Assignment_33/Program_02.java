import java.util.Scanner;

class CheckAlphabet 
{
    private char ch;

    public CheckAlphabet(char value) 
    {
        this.ch = value;
    }

    public boolean chkCapital() 
    {
        if ((ch >= 'A' && ch <= 'Z')) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

class Program_02
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

        CheckAlphabet cobj = new CheckAlphabet(cValue);

        bRet = cobj.chkCapital();

        if (bRet == true) 
        {
            System.out.println("It is Capital Character");
        }
        else 
        {
            System.out.println("It is not a Capital Character");
        }

        sobj.close();
    }
}
