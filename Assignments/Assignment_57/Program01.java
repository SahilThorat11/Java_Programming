import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Program_01 
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sobj.nextLine();

        System.out.print("Enter destination file name: ");
        String destination = sobj.nextLine();

        FileReader frobj = new FileReader(source);
        FileWriter fwobj = new FileWriter(destination);

        int ch;
        while ((ch = frobj.read()) != -1) 
        {
            fwobj.write(ch);
        }

        frobj.close();
        fwobj.close();

        System.out.println("File copied successfully.");
    }
}
