import java.util.*;

class program298
{
    public static void main(String A[])
    {
        ArrayList <String> aobj = new ArrayList <String> ();

        aobj.add("C");
        aobj.add("C++");
        aobj.add("java");
        aobj.add("python");
        aobj.add("C#");
        aobj.add("java");


        System.out.println(aobj);

        aobj.add(2,"LSP");

        System.out.println(aobj);

        System.out.println(aobj.contains("LSP"));
        System.out.println(aobj.contains("Unix"));

        aobj.remove(6);

        System.out.println(aobj);

        Iterator iobj = aobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        aobj.clear();
    }
}