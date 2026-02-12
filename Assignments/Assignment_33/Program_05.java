import java.util.Scanner;

class CheckAlphabet 
{
    private char ch;

    public CheckAlphabet(char value) 
    {
        this.ch = value;
    }

    public int DisplaySchedule() 
    {
        if(ch == 'A' || ch == 'a')
        {
            return 1;   // Standard A
        }   
        else if(ch == 'B' || ch == 'b')
        {
            return 2;   // Standard B
        }  
        else if(ch == 'C' || ch == 'c')
        {
            return 3;   // Standard C
        }   
        else if(ch == 'D' || ch == 'd')
        {
            return 4;   // Standard D
        }   
        else
        {
            return 0;   // Invalid standard
        }
    }
}

class Program_05
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        int iRet = 0;

        System.out.println("Enter the character (A-D) : ");
        cValue = sobj.next().charAt(0);

        CheckAlphabet cobj = new CheckAlphabet(cValue);

        iRet = cobj.DisplaySchedule();

        switch(iRet)
        {
            case 1: 
                System.out.println("Exam at 9 AM.");
                break;

            case 2: 
                System.out.println("Exam at 10 AM.");
                break;

            case 3: 
                System.out.println("Exam at 11 AM.");
                break;

            case 4: 
                System.out.println("Exam at 12 NOON.");
                break;

            default:
                System.out.println("Invalid standard.");
        }

        sobj.close();
    }
}
