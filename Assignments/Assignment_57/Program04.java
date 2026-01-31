import java.io.*;
import java.util.*;
import java.util.zip.CRC32;

class Program_04 
{
    public static void main(String A[]) throws Exception 
    {
        int data = 0; 
        Scanner sobj = null;
        String fileName = null;
        FileInputStream fiobj = null;
        CRC32 checksum = null;
        
        sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        fileName = sobj.nextLine();

        fiobj = new FileInputStream(fileName);
        checksum = new CRC32();

        while ((data = fiobj.read()) != -1) 
        {
            checksum.update(data);
        }

        fiobj.close();

        System.out.println("Checksum value: " + checksum.getValue());
    }
}
