import java.io.File;
import java.util.Scanner;

class Program_01
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String FileName = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter fobj name: ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if (fobj.exists()) 
        {
            System.out.println("File opened successfully.");
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}
