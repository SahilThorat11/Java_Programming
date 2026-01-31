import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Program_01 
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner sobj = null;

        String source = null;
        String destination = null;

        FileReader frobj = null;
        FileWriter fwobj = null;

        sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter source file name: ");
            source = sobj.nextLine();

            System.out.print("Enter destination file name: ");
            destination = sobj.nextLine();

            frobj = new FileReader(source);
            fwobj = new FileWriter(destination);

            while ((iRet = frobj.read()) != -1) 
            {
                fwobj.write(iRet);
            }

            frobj.close();
            fwobj.close();

            System.out.println("File copied successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
