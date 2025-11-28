import java.util.Scanner;

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Input is : "+str);
        System.out.println("Length of string is : "+str.length());
    }
}