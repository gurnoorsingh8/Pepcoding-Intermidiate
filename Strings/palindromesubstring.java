import java.util.Scanner;
public class palindromesubstring
{
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPalindrome(String s)
    {
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i++) != s.charAt(j--))
            {
                return false;
            }
        }
        return true;
    }

    public static void substring(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            for(int len = 1; i + len <= str.length(); len++)
            {
                String s = str.substring(i, i + len);
                if(isPalindrome(s))
                {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        substring(str);
    }
}