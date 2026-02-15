class Printing
{
    static int iCnt = 0;  

    public static void Display() 
    {
        if (iCnt < 5) 
        {
            System.out.print("*\t");
            iCnt++;
            Display();  
        }
    }

}

class Program_01 
{
    public static void main(String[] args) 
    {
        Printing pobj = new Printing();
        
        pobj.Display();
    }
}
