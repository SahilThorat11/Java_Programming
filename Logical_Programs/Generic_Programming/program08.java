import java.util.*;

class program299
{
    public static void main(String A[])
    {
        LinkedList <Double> lobj = new LinkedList <Double> ();

        lobj.add(10.5);
        lobj.add(30.7);
        lobj.add(12.6);
        lobj.add(78.9);
        lobj.add(90.7);

        System.out.println(lobj);

        lobj.addFirst(10.0);
        lobj.addLast(100.0);

        lobj.remove(2);

        System.out.println(lobj);

        Iterator iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        lobj.clear();
    }
}