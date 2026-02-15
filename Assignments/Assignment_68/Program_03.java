class Printing
{
    static int iCnt = 5;  

    public static void Display() 
    {
        if (iCnt >= 1) 
        {
            System.out.print(iCnt + "\t");
            iCnt--;
            Display();  
        }
    }

}

class Program_03
{
    public static void main(String[] args) 
    {
        Printing pobj = new Printing();
        pobj.Display();
    }
}
