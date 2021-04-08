import java.util.Scanner;
public class substring
{
    public static Scanner scn = new Scanner(System.in);
    public static void substring(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            for(int len = 1; i + len <= str.length(); len++)
            {
                System.out.println(str.substring(i, i + len));
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