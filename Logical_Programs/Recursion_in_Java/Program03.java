
class Demo
{
    public void Display(int No)
    {
        if(No == 0)
        {
            return;
        }
        
        System.out.println(No);

        Display(No -1);

        System.out.println(No);

    }
}

class Program03
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.Display(5);
    }
}