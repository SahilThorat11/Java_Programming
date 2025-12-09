import java.util.Scanner;

class program6_1
{
    public static void main(String A[])
    {
        String Name = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter full name : ");
        Name = sobj.nextLine();

        System.out.println("Your name is : " + Name);
    }
}