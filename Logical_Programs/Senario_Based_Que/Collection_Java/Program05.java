/* 
    0   1   2   3   4   5   6   7   8   9   .....
    a   b   c   d   e   f   g   h   i   j   .....
    97  98  99  100 101 102 103 104 105 106 .....
 */

import java.util.*;

class Program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        int Old = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                Old = hobj.get(ch);
                hobj.put(ch, Old + 1);
            }
            else 
            {
                hobj.put(ch, 1);
            }
        }

        for(char ch : hobj.keySet())
        {
            System.out.println(ch + " : " + hobj.get(ch));
        }

        System.out.println(hobj);

        sobj.close();
    }
}
