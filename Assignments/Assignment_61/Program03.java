import java.io.*;
import java.util.*;

class Program_03
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        System.out.print("Enter the string to append : ");
        String str = sobj.nextLine();

        FileOutputStream foobj = new FileOutputStream(FileName,true);

        byte Arr[] = str.getBytes();

        foobj.write(Arr);

        System.out.println("String appended successfully.");

        foobj.close();
        sobj.close();
    }
}