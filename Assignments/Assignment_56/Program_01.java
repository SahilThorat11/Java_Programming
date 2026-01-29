import java.io.File;
import java.util.Scanner;

class Program_01 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

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
