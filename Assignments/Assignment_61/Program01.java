import java.io.*;
import java.util.*;

class Program01
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String Source = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String Dest = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(Source);
        FileOutputStream foobj = new FileOutputStream(Dest);

        int data = 0;

        while((data = fiobj.read()) != -1)
        {
            foobj.write(data);
        }

        System.out.println("Data copied successfully.");

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}