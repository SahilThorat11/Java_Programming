import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Program_02 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) 
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nFile Contents:");
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
            br.close();
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}
