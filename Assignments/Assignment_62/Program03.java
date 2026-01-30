import java.io.*;
import java.util.*;

class Program03
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int N = sobj.nextInt();

        File fobj = new File(FileName);

        int FileSize = (int)fobj.length();

        FileInputStream fiobj = new FileInputStream(FileName);
        FileOutputStream foobj = new FileOutputStream("Output.txt");

        byte Buffer[] = new byte[FileSize];

        fiobj.read(Buffer);

        foobj.write(Buffer,FileSize - N,N);

        System.out.println("Last " + N + " bytes copied successfully.");

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}