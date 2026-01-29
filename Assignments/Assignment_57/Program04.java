import java.io.FileInputStream;
import java.util.Scanner;
import java.util.zip.CRC32;

class Program_04 
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sobj.nextLine();

        FileInputStream fisobj = new FileInputStream(fileName);
        CRC32 checksum = new CRC32();

        int data;
        while ((data = fisobj.read()) != -1) 
        {
            checksum.update(data);
        }

        fisobj.close();

        System.out.println("Checksum value: " + checksum.getValue());
    }
}
