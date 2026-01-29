import java.io.FileWriter;
import java.util.Scanner;

public class Program_03 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName, true); // true = append mode

        System.out.print("Enter data to write: ");
        String data = sc.nextLine();

        fw.write("\n" + data);
        fw.close();

        System.out.println("Data written successfully.");
    }
}
