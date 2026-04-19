class StringDemo
{
    public void CountVowelsCons(String str)
    {
        str = str.toLowerCase();

        int iVowels = 0;
        int iCons = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    iVowels++;
                }
                else
                {
                    iCons++;
                }
            }
        }

        System.out.println("Vowels = " + iVowels);
        System.out.println("Consonants = " + iCons);
    }
}

class Program05
{
    public static void main(String A[])
    {
        StringDemo sobj = new StringDemo();

        String str = "Hello World";

        sobj.CountVowelsCons(str);
    }
}

/*
--------------------------------------------------------------------------------------------------------------------
Problem :
    Count the total number of vowels and consonants in a given string, ignoring spaces and special characters.

Output : 
        Vowels = 3
        Consonants = 7

Complexity :
        Time :  O(n)
        Space : O(1)
--------------------------------------------------------------------------------------------------------------------
*/