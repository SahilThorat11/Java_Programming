import java.io.File;
import java.util.Scanner;

class Program_05 
{
    public static void main(String A[]) 
    {
        int i = 0;
        Scanner sobj = null;
        String dirName = null;

        File fobj = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        dirName = sobj.nextLine();

        fobj = new File(dirName);

        if (fobj.exists() && fobj.isDirectory()) 
        {
            File fArr[] = fobj.listFiles();

            for(i = 0; i < fArr.length; i++)
            {
                System.out.println(fArr[i].getName());
            }
        } 
        else 
        {
            System.out.println("There is no such directory.");
        }
    }
}
