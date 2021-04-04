import java.util.Scanner;
import java.util.ArrayList;
public class subsequent
{
    public static Scanner scn = new Scanner(System.in);
    public static void subsequent(String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int size = ans.size();
            for(int j = 0; j < size; j++)
            {
                ans.add(ans.get(j) + ch);
            }
        }
        System.out.println(ans.toString());
    }

    public static void main(String[] args)
    {
        String str = scn.nextLine();
        subsequent(str);
    }
}