import java.util.Scanner;

class StringX
{
    private String str;

    public StringX()
    {
        this.str = "";
    }

    public void getInput()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        this.str = sobj.nextLine();
    }

    public int CountCharacters()
    {
        return str.length();  
    }
}

public class Program_03
{
    public static void main(String[] args)
    {
        StringX sobj = new StringX();

        sobj.getInput();
        int iRet = sobj.CountCharacters();

        System.out.println("Number of characters are: " + iRet);
    }
}
