import java.util.Scanner;

class Printer 
{
    private int iNo;   
    private int iCnt; 

    public Printer() 
    {
        this.iNo = 0;   
    }

    public void getInput()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter number of times you want to print: ");
        this.iNo = sobj.nextInt();  
    }

    public void display() 
    {
        if(iNo >= 1)
        {
            System.out.print(iNo + "\t");
            iNo--;
            display();
        }
    }
}

public class Program_03
{
    public static void main(String[] args)
    {
        Printer pobj = new Printer();  
        
        pobj.getInput();   
        pobj.display();                          
    }
}
