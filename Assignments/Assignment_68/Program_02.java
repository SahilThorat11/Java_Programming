import java.util.Scanner;

class Printer 
{
    private int iNo;   
    private int iCnt; 

    public Printer() 
    {
        this.iNo = 0;
        this.iCnt = 1;      
    }

    public void getInput()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter number of times you want to print: ");
        this.iNo = sobj.nextInt();  
    }

    public void display() 
    {
        if (iCnt <= iNo) 
        {
            System.out.print(iCnt + "\t");
            iCnt++;        
            display();     
        }
    }
}

public class Program_02
{
    public static void main(String[] args)
    {
        Printer pobj = new Printer();  
        
        pobj.getInput();   
        pobj.display();                          
    }
}
