import java.io.File;
import java.util.Scanner;

class Program_02 
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String fileName = null;
        File fobj = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        fileName = sobj.nextLine();

        fobj = new File(fileName);

        if (fobj.exists() && fobj.isFile()) 
        {
            System.out.println("It is a regular file.");
        } 
        else 
        {
            System.out.println("It is NOT a regular file.");
        }
    }
}
