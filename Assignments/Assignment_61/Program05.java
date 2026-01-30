import java.io.*;
import java.util.*;

class Program05
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        FileInputStream fiobj = new FileInputStream(FileName);

        FileOutputStream foobj1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream foobj2 = new FileOutputStream("SecondHalf.txt");

        int FileSize = (int)fobj.length();
        byte Buffer[] = new byte[FileSize];

        fiobj.read(Buffer);

        int Half = FileSize / 2;

        foobj1.write(Buffer,0,Half);
        foobj2.write(Buffer,Half,FileSize-Half);

        System.out.println("File splitted successfully.");

        fiobj.close();
        foobj1.close();
        foobj2.close();
        sobj.close();
    }
}