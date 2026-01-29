import java.io.File;
import java.util.Scanner;

class Program_04 
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.createNewFile()) 
        {
            System.out.println("File created successfully.");
        } 
        else
        {
            System.out.println("File already exists.");
        }
    }
}
