import java.util.Scanner;
import java.util.ArrayList;
public class permutation
{
    public static Scanner scn = new Scanner(System.in);
    public static void appendChar(String str, char ch, ArrayList<String> ans)
    {
        for(int i = 0; i <= str.length(); i++)
        {
            String s = str.substring(0,i) + ch + str.substring(i);
            ans.add(s);
        }
    }

    public static ArrayList<String> permutation(String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            ArrayList<String> smallans = new ArrayList<>();
            for(String s : ans)
            {
                appendChar(s, ch, smallans);
            }
            ans = smallans;
        }

        return ans;
    }

    public static void main(String[] args)
    {
        String str = scn.nextLine();
        System.out.println(permutation(str));
    }
} 