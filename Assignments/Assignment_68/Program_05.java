import java.util.Scanner;

class Printer 
{
    private int iNo;     
    private char ch;    

    public Printer() 
    {
        this.iNo = 0;
        this.ch = 'a';   
    }

    public void getInput()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter number of characters to print: ");
        this.iNo = sobj.nextInt();
    }

    public void display() 
    {
        if(iNo > 0)
        {
            System.out.print(ch + "\t");
            ch++;       
            iNo--;       
            display();   
        }
    }
}

public class Program_05
{
    public static void main(String[] args)
    {
        Printer pobj = new Printer();
        
        pobj.getInput();   
        pobj.display();                             
    }
}
