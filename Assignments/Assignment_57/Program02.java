import java.io.File;
import java.util.Scanner;

class Program_02 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) 
        {
            System.out.println("It is a regular file.");
        } 
        else 
        {
            System.out.println("It is NOT a regular file.");
        }
    }
}
