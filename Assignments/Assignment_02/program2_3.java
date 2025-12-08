import java.util.Scanner;

class Demo
{
    void Display(int iNo)
    {
        if (iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }
    } 
}

class program2_3
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.Display(iValue);
    } 
}


