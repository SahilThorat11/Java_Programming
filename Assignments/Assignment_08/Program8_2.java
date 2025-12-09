import java.util.Scanner;

class Arithematic
{
    void Display(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        switch(iNo)
        {
            case 1 :
            
                System.out.println("One");
                break;
            
            case 2 :
            
                System.out.println("Two");
                break;
               
            case 3 :
            
                System.out.println("Three");
                break;
              
            case 4 :
            
                System.out.println("Four");
                break;
              
            case 5 :
            
                System.out.println("Five");
                break;
              
            case 6 :
            
                System.out.println("Six");
                break;
              
            case 7 :
            
                System.out.println("Seven");
                break;
              
            case 8 :
            
                System.out.println("Eight");
                break;
              
            case 9 :

                System.out.println("Nine");
                break;

            default :
            
                System.out.println("Invalid Input");
                return;
        }   
    }
}

class Program8_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.Display(iValue);
    }
}