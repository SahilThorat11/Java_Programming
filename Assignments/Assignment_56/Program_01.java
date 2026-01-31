import java.io.File;
import java.util.Scanner;

class Program_01
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String FileName = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        FileName = sobj.nextLine();

        File file = new File(FileName);

        if (file.exists()) 
        {
            System.out.println("File opened successfully.");
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}
